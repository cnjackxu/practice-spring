/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 *
 * @author jack
 */
@Repository("gameRepo")
public class GameRepositoryImpl implements GameRepository {

    @Override
    public void save() {
        System.out.println("GameRepository\t-save...");
    }
    
}
