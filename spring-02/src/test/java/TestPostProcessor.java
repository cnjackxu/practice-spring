/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jacklab.spring.postprocessor.OnlineGame;
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
public class TestPostProcessor {
    
    ClassPathXmlApplicationContext ctx=null;
    public TestPostProcessor() {
        ctx=new ClassPathXmlApplicationContext("appConfig-post.xml");
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
     public void hello() {
         OnlineGame game = (OnlineGame) ctx.getBean("game");
         ctx.destroy();
     }
}
