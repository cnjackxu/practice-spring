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
@Repository("gameRepoNoSQL")
public class GameRepositoryNoSQLImpl implements GameRepository{

    @Override
    public void save() {
        System.out.println("GameRepoNoSQL\t -save");
    }
    
}
