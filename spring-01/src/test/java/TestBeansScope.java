/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jacklab.spring.scope.OnlineGame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jack
 */
public class TestBeansScope {
    private ApplicationContext ctx=null;
    public TestBeansScope() {
        ctx=new ClassPathXmlApplicationContext("appConfig-scope.xml");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testScope() {
         //default scope is Singleton
         OnlineGame game1a=(OnlineGame) ctx.getBean("game");
         OnlineGame game1b=(OnlineGame) ctx.getBean("game");
         System.out.println("game1a==game1b: "+ (game1a==game1b));
         
         OnlineGame game2a=(OnlineGame) ctx.getBean("game2");
         OnlineGame game2b=(OnlineGame) ctx.getBean("game2");
         System.out.println("game2a==game2b: "+ (game2a==game2b));
     }
}
