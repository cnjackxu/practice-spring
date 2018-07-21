/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jacklab.spring.annotation.OnlineGame;
import com.jacklab.spring.annotation.controller.GameController;
import com.jacklab.spring.annotation.repository.GameRepository;
import com.jacklab.spring.annotation.service.GameService;
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
public class TestAnnotation {
    ApplicationContext ctx=null;
    public TestAnnotation() {
        ctx=new ClassPathXmlApplicationContext("appConfig-annotation.xml");
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
         OnlineGame game=(OnlineGame) ctx.getBean("onlineGame");
//         System.out.println("Online Game: "+game.toString());
         
         GameController ctrl=(GameController) ctx.getBean("gameController");
//         System.out.println("Game Controller: "+ctrl.toString());
//         
//         GameService svc= (GameService) ctx.getBean("gameService");
//         System.out.println("Game Service: "+svc.toString());
//         
////         GameRepository repo=(GameRepository) ctx.getBean("gameRepositoryImpl");
//         GameRepository repo=(GameRepository) ctx.getBean("gameRepo");
//         System.out.println("Game Repository: "+repo.toString());


        ctrl.process();

     }
}
