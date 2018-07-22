/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.model;

/**
 *
 * @author jack
 */
public class L649 extends OnlineGame{
    private String gameName;
    private String gameType;

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
        return "L649{" + "gameName=" + gameName + ", gameType=" + gameType + '}';
    }
    
    
}
