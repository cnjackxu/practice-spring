/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.jdbc.model;

/**
 *
 * @author jack
 */
public class OnlineGame {
    
    private Integer pid;
    private String name;
    private Boolean isActive;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "OnlineGame{" + "pid=" + pid + ", name=" + name + ", isActive=" + isActive + '}';
    }
    
    
    
}
