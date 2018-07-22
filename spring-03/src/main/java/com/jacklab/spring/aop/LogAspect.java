/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.aop;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author jack
 */
@Component
@Aspect
@Order(2)
public class LogAspect {
    
    private Logger logger=Logger.getLogger("LogAspect");
    
//    @Before("execution(public String com.jacklab.spring.aop.GameProcessor.getGameType(Object))")
    @Before("execution(public * com.jacklab.spring.aop.GameProcessor.*(*))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        logger.log(Level.INFO, "[log-before] method:"+methodName);
    }
    
    
    @After("execution(public * com.jacklab.spring.aop.GameProcessor.*(*))")
    public void afterMethod(JoinPoint point){
        logger.log(Level.INFO,"[log-after] method:"+point.getSignature().getName());
    }
    
    @AfterReturning(value="execution(public * com.jacklab.spring.aop.GameProcessor.*(*))",
            returning = "result")
    public void afterReturning(JoinPoint point, Object result){
        String returnStr=result==null?"NULL":result.toString();
        logger.log(Level.INFO,"[log-returning] method:"+point.getSignature().getName() +", return:"+returnStr);
        
    }
    
    @AfterThrowing(value="execution(public * com.jacklab.spring.aop.GameProcessor.*(*))",
            throwing = "ex")
    public void afterReturning(JoinPoint point, Exception ex){
        
        logger.log(Level.INFO,"[log-throwing] method:"+point.getSignature().getName() +", exception:"+ex);
        
    }
}
