/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author jack
 */
public class JackBeanPostProcessor implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {

        if(o instanceof OnlineGame && "game".equals(string)){
            OnlineGame game=(OnlineGame) o;
            System.out.println("post processor-before init..."+game.toString());
            return game;
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        if(o instanceof OnlineGame && "game".equals(string)){
            OnlineGame game=(OnlineGame) o;
            //do some validation
            //if passed
            game.setIsValidated(true);
            System.out.println("post processor-after init..."+game.toString());
            return game;
        }
        return o;
    }
    
}
