package com.demo.rest.business.services;

import com.demo.rest.business.interfaces.IUserServices;
import com.demo.rest.dal.UserDAL;
import com.demo.rest.model.User;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@Named
@RequestScoped

public class UserServices implements IUserServices{

    @Inject

    UserDAL userDAL;

    @Override
    public User authenticateUser(User user) {
        // Call the authentication method of UserDAO to authenticate the user
        User authenticatedUser = userDAL.auth(user);

        if (authenticatedUser != null) {
            return authenticatedUser;
        }
        return null;
    }

    @Override
    public User createUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public User getUserById(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public void deleteUser(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void updateUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }
    
}
