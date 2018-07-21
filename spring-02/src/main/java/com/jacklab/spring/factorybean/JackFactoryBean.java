/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 *
 * @author jack
 */
public class JackFactoryBean implements FactoryBean<OnlineGame>{

    private String someAttr;
    public String getSomeAttr(){
        return someAttr;
    }
    public void setSomeAttr(String val){
        someAttr=val;
    }
    
    @Override
    public OnlineGame getObject() throws Exception {
        return new OnlineGame(someAttr);
    }

    @Override
    public Class<?> getObjectType() {
        return OnlineGame.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
    
}
