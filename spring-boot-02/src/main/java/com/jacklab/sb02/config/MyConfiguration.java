package com.jacklab.sb02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.jacklab.sb02.component.LoginIntercepter;

// using @enableWebMvc will lose all web auto configurations by spring boot
@Configuration
public class MyConfiguration extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/signin").setViewName("signin");
//		super.addViewControllers(registry);
	}

	// Substitution of dispatch by controller
	@Bean
	public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
		WebMvcConfigurerAdapter adapter=new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("signin");
				registry.addViewController("/index.html").setViewName("signin");
				registry.addViewController("/main.html").setViewName("dashboard");
			}
			
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(new LoginIntercepter())
					.addPathPatterns("/**")
					.excludePathPatterns("/index.html","/","/user/login");
			}
		};
		return adapter;
	}
	
}
