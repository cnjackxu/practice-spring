/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.annotation;

import org.springframework.stereotype.Component;

/**
 *
 * @author jack
 */
@Component
public class OnlineGame {
    
    private String ctrlNum;

    public String getCtrlNum() {
        return ctrlNum;
    }

    public void setCtrlNum(String ctrlNum) {
        this.ctrlNum = ctrlNum;
    }
    
    
}
