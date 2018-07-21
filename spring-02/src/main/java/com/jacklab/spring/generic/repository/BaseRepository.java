/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.generic.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jack
 */
@Repository("baseRepo")
public class BaseRepository<T> {
   
    
    
    public void save(){
        System.out.println("save...\t");
    }
    
}
