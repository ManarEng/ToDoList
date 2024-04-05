package com.demo.rest.model;

import java.io.Serializable;
import java.util.Set;

import jakarta.inject.Named;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Named
@Entity
@Table(name = "user")

public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int id;

  
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) 
 
    private Set<Todo> todo; 

    private String login;
    private String password;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Todo> getTodo() {
        return todo;
    }

    public void setContacts(Set<Todo> todo) {
        this.todo = todo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
}
