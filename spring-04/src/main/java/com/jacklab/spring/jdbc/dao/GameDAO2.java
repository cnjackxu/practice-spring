/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.jdbc.dao;

import com.jacklab.spring.jdbc.model.OnlineGame;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jack
 */
@Repository
public class GameDAO2 {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public OnlineGame getGameById(Integer id) {
        String sql = "select * from tb_game_online where pid=:pid";
        Map<String, Object> params = new HashMap<>();
        params.put("pid", id);

        OnlineGame game = (OnlineGame) namedParameterJdbcTemplate.queryForObject(sql, params, new BeanPropertyRowMapper<>(OnlineGame.class));
        return game;
    }
    
    public void updateGame(OnlineGame game){
        String sql="update tb_game_online set is_active=:isActive where pid=:pid";
        SqlParameterSource paramSource= new BeanPropertySqlParameterSource(game);
        namedParameterJdbcTemplate.update(sql, paramSource);
    }
}
