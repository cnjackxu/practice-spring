/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.aop;

import com.jacklab.spring.model.OnlineGame;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author jack
 */
@Component
@Aspect
@Order(1)
public class ValidatorAspect {
    
    @Pointcut("execution(public * com.jacklab.spring.aop.GameProcessor.*(*))")
    public void declareJoinPoint(){}
    
    @Before("declareJoinPoint()")
    public void validate(JoinPoint point){
        Object arg = (Object) point.getArgs()[0];
        if(arg instanceof OnlineGame){
            Logger.getLogger("validator").log(Level.INFO,"[validator] passed");
        }else{
            Logger.getLogger("validator").log(Level.WARNING,"[validator] failed");
            
        }
    }
}
