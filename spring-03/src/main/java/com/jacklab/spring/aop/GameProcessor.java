/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.aop;

import com.jacklab.spring.processor.*;
import com.jacklab.spring.model.DailyGrand;
import com.jacklab.spring.model.L649;
import com.jacklab.spring.model.LottoMax;

/**
 *
 * @author jack
 */
public interface GameProcessor {
    
    String getGameType(Object obj);
    void processLmax(LottoMax lmax);
    void processL649(L649 l649);
    void processDailyGrand(DailyGrand dg);
}
