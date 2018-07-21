/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.generic.service;

import com.jacklab.spring.generic.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jack
 */
@Service
public class BaseService<T> {
    
    @Autowired
    protected BaseRepository<T> baseRepo;
    
    public void add(){
        System.out.println("add...\t"+this);
        baseRepo.save();
        
    }
}
