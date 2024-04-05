package com.demo.rest.controller;

import com.demo.rest.business.services.UserServices;
import com.demo.rest.model.User;

import jakarta.inject.Inject;
import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;



@Path("/users")
public class UserController {
    
    @Inject  
    UserServices userServices;

    HttpSession session;


    @Path("/auth")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    
    public User auth(User user){
         return userServices.authenticateUser(user);
         //return user;

    }
}
