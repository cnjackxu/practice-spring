/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.annotation.controller;

import com.jacklab.spring.annotation.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author jack
 */
@Controller
public class GameController {
    
    @Autowired
    private GameService gameService;
    
    public void process(){
        System.out.println("\r\nGameController\t-process...");
        gameService.add();
    }
}
