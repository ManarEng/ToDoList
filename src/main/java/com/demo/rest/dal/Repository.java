package com.demo.rest.dal;

public interface Repository <T,I> {
    
    T create(T entity);
    T auth(T entity);
    void delete(T entity);
    void update(T entity);

    
}
