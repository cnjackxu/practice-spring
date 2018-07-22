/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jacklab.spring.aop.GameProcessor;
import com.jacklab.spring.model.DailyGrand;
import com.jacklab.spring.model.LottoMax;
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
public class TestAOP {
    private ApplicationContext ctx=null;
    public TestAOP() {
        ctx=new ClassPathXmlApplicationContext("appConfig-aop.xml");
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
     
         GameProcessor processor=  (GameProcessor) ctx.getBean("gameProcessor");
//         processor.getGameType(new LottoMax());
         processor.processLmax(new LottoMax());
//         processor.processDailyGrand(new DailyGrand());
     }
}
