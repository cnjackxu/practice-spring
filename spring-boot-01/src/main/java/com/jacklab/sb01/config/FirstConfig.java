package com.jacklab.sb01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jacklab.sb01.service.GameService;

@Configuration
public class FirstConfig {

	@Bean
	public GameService gameService() {
		return new GameService();
	}
}
