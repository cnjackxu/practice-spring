/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.postprocessor;

/**
 *
 * @author jack
 */
public class OnlineGame {
    
    private String ctrlNumber;
    private String gameName;
    private String gameType;
    private boolean isValidated;

    public OnlineGame(){
        System.out.println("constructor...");
    }
    
    public void init(){
        System.out.println("init...");
    }
    
    public void destory(){
        System.out.println("destory...");
    }
    
    public boolean isIsValidated() {
        return isValidated;
    }

    public void setIsValidated(boolean isValidated) {
        this.isValidated = isValidated;
    }

    public String getCtrlNumber() {
        return ctrlNumber;
    }

    public void setCtrlNumber(String ctrlNumber) {
        this.ctrlNumber = ctrlNumber;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    @Override
    public String toString() {
        return "OnlineGame{" + "ctrlNumber=" + ctrlNumber + ", gameName=" + gameName + ", gameType=" + gameType + ", isValidated=" + isValidated + '}';
    }


    
    
}
