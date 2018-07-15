/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.springmvc.model;

import org.springframework.stereotype.Component;

/**
 *
 * @author jack
 */
@Component
public class User {
    public User(){
        System.out.println("User: constructor...");
    }
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + '}';
    }
    
    
}
