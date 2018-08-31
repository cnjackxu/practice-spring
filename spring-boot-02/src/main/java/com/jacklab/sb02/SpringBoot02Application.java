package com.jacklab.sb02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02Application.class, args);
	}
	
//	public ViewResolver myViewResolver() {
//		return new MyViewResolver();
//	}
//	
//	private static class MyViewResolver implements ViewResolver{
//
//		@Override
//		public View resolveViewName(String viewName, Locale locale) throws Exception {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		
//	}
}
