package com.jacklab.sb01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.jacklab.sb01.bean.OnlineGame;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01ApplicationTests {

	@Autowired
	OnlineGame onlineGame;
	
	@Autowired
	ApplicationContext ctx;
	
	@Test
	public void contextLoads() {
		System.out.println(onlineGame.toString());
	}
	
	@Test
	public void checkGameService() {
		System.out.println("=========>IOC-GameService: "+ctx.containsBean("gameService"));
	}

}
