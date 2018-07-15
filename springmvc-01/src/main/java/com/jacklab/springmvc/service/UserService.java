/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.springmvc.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author jack
 */
@Service
public class UserService {
    
    public UserService(){
        System.out.println("UserService:constructor..."); 
    }
    
    public void doAction(String name){
        System.out.println("UserService:doAction...name:"+name);
    }
}
