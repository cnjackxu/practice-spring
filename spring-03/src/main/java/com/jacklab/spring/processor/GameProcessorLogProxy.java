/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.processor;

import com.jacklab.spring.model.DailyGrand;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


/**
 * 
 * @author jack
 */
public class GameProcessorLogProxy {
    
    private GameProcessor target;
    
    public GameProcessorLogProxy(GameProcessor target){
        this.target=target;
    }
    
    public GameProcessor getLogProxy(){
        GameProcessor proxy=null;
        
        ClassLoader loader=target.getClass().getClassLoader();
        Class[] interfaces= new Class[]{GameProcessor.class};
        InvocationHandler handler= new InvocationHandler() {
            
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                
                Object result = method.invoke(target, args);
                //do log
                System.out.println("GameProcessor is invoking method:"+method.getName()+", args:"+Arrays.asList(args));
                return result;
            }
        };
                
        proxy= (GameProcessor) Proxy.newProxyInstance(loader, interfaces, handler);
        
        return proxy;
    } 
}
