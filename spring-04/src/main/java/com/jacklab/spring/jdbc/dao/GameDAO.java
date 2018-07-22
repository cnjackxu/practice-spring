/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.jdbc.dao;

import com.jacklab.spring.jdbc.model.OnlineGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jack
 */
@Repository
public class GameDAO extends JdbcDaoSupport {

   
    
    /* Alternative: if JdbcTemplate not specified in xml
    
        @Autowired
        public void setJdbc(JdbcTemplate jdbcTemplate){
            setJdbcTemplate(jdbcTemplate);
        }
    */
    
    
    public OnlineGame getOnlineGameByID(Integer id) {
        String sql = "select * from tb_game_online where pid=?";
        OnlineGame game = (OnlineGame) getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<>(OnlineGame.class), id);
        return game;
    }
    
    

}
