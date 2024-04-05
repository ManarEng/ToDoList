package com.demo.rest.business.interfaces;

import com.demo.rest.model.User;

public interface IUserServices {

    
    User createUser(User user);
    User authenticateUser(User user);
    User getUserById(Long userId);
    void deleteUser(Long userId);
    void updateUser(User user);   
}
