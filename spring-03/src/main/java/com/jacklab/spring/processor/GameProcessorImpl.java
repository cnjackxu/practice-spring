/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.processor;

import com.jacklab.spring.model.DailyGrand;
import com.jacklab.spring.model.L649;
import com.jacklab.spring.model.LottoMax;

/**
 *
 * @author jack
 */
public class GameProcessorImpl implements GameProcessor{

    @Override
    public void processLmax(LottoMax lmax) {
        System.out.println("process lotto max...");
    }

    @Override
    public void processL649(L649 l649) {
        System.out.println("process lotto 649...");
    }

    @Override
    public void processDailyGrand(DailyGrand dg) {
        System.out.println("process daily grand");
    }

    @Override
    public String getGameType(Object obj) {
        if(obj instanceof LottoMax || obj instanceof L649 || obj instanceof DailyGrand)
            return "online";
        return "unknown";
    }
    
    
}
