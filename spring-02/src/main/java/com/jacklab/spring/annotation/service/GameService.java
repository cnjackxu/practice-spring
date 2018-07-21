/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.annotation.service;

import com.jacklab.spring.annotation.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author jack
 */
@Service
public class GameService {
    
    @Autowired
    @Qualifier("gameRepoNoSQL")
    private GameRepository gameRepo;
    
//    @Autowired
//    public void setGameRepository(@Qualifier("gameRepoNoSQL") GameRepository repo){
//        gameRepo=repo;
//    }
    
    public void add(){
        System.out.println("GameService\t-add...");
        gameRepo.save();
    }
}
