package com.demo.rest.dal;

import com.demo.rest.model.User;
import java.util.List;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
   
@Named
@RequestScoped 

@Transactional 

public class UserDAL implements Repository<User, Long> {

    @PersistenceContext(name="manarnotes")

    private EntityManager entityManager;

    @Override
    public User create(User entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public User auth(User entity) {
        String jpql = "SELECT u FROM User u WHERE u.login = :login AND u.password = :password";

        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        query.setParameter("login", entity.getLogin());
        query.setParameter("password", entity.getPassword());

        List<User> resultList = query.getResultList();
        if (!resultList.isEmpty()) {
            return resultList.get(0);
        }
        return null;
    }

  
    @Override
    public void delete(User entity) {
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
    }

    @Override
    public void update(User entity) {
        entityManager.merge(entity);
    }

}
    

