/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.springmvc.controller;

import com.jacklab.springmvc.model.User;
import com.jacklab.springmvc.service.UserService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

/**
 *
 * @author jack
 */
@Controller
public class UserController {
    
    @Autowired
    private UserService uService;
    @Autowired
    private User user;
    
    public UserController(){
        System.out.println("UserController:constructor...");
    }
    
    @RequestMapping("/hello")
    public String processRequest(@RequestParam(name = "userName") String uName, HttpServletRequest request){
        System.out.println("UserController: process request...");
        uService.doAction(uName);
        request.setAttribute("userName", uName);
        return "success";
    }
        
    
        
}
