/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jacklab.spring.model.DailyGrand;
import com.jacklab.spring.model.LottoMax;
import com.jacklab.spring.processor.GameProcessor;
import com.jacklab.spring.processor.GameProcessorImpl;
import com.jacklab.spring.processor.GameProcessorLogProxy;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jack
 */
public class TestProxy {

    public TestProxy() {
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
//        GameProcessor processor = new GameProcessorImpl();
//        processor.processDailyGrand(new DailyGrand());

        GameProcessor processor = new GameProcessorImpl();
        GameProcessor proxy = new GameProcessorLogProxy(processor).getLogProxy();
//        proxy.processDailyGrand(new DailyGrand());
        String result= proxy.getGameType(new DailyGrand());
        System.out.println("result:"+result);
    }
}
