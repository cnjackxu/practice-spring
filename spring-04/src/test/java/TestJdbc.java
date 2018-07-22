/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jacklab.spring.jdbc.dao.GameDAO;
import com.jacklab.spring.jdbc.dao.GameDAO2;
import com.jacklab.spring.jdbc.model.OnlineGame;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author jack
 */
public class TestJdbc {

    ApplicationContext ctx = null;
    JdbcTemplate jdbc = null;

    public TestJdbc() {
        ctx = new ClassPathXmlApplicationContext("appConfig-jdbc.xml");
        jdbc = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testConn() {
        try {
            DataSource ds = (DataSource) ctx.getBean("dataSource");
            System.out.println(">>>conn:" + ds.getConnection());

        } catch (SQLException ex) {
            Logger.getLogger(TestJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    @Test
    public void testQueryForValue() {
        String sql = "select is_active from tb_game_online where pid=?";
        Object[] args = new Object[]{1};
        Boolean result = jdbc.queryForObject(sql, Boolean.class, args);
        System.out.println(">>>Value:" + result);

    }
    
    @Test
    public void testQueryForBean() {
        String sql = "select * from tb_game_online where pid=?";
        Object[] args = new Object[]{1};
        OnlineGame game = (OnlineGame) jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(OnlineGame.class), args);
        System.out.println(">>>Object:" + game);

    }
    
    @Test
    public void testQueryForList() {
        String sql="select * from tb_game_online where pid>?";
        Object[] args = new Object[]{0};
        List<OnlineGame> games = jdbc.query(sql, args, new BeanPropertyRowMapper<>(OnlineGame.class));
        System.out.println(">>>List: "+games);
    }
    
    @Test
    public void testGameDAO(){
        GameDAO dao =(GameDAO) ctx.getBean("gameDAO");
        OnlineGame game = dao.getOnlineGameByID(1);
        System.out.println(">>>DAO#getOnlineGameByID: "+game);
        
    }
    
    @Test
    public void testGameDAO2(){
        GameDAO2 dao2=(GameDAO2) ctx.getBean("gameDAO2");
        OnlineGame game= dao2.getGameById(2);
        System.out.println(">>>DAO2#getGameByID: "+game);
    }
    
    @Test
    public void testGameDAO2Update(){
        GameDAO2 dao2=(GameDAO2) ctx.getBean("gameDAO2");
        
        OnlineGame game= dao2.getGameById(2);
        game.setIsActive(Boolean.FALSE);
        dao2.updateGame(game);
    }
}
