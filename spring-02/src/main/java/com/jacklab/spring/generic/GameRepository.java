/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jacklab.spring.generic;

import com.jacklab.spring.generic.repository.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jack
 */
@Repository("gameRepo")
public class GameRepository extends BaseRepository<OnlineGame>{
    
}
