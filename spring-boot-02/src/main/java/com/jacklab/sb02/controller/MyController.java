package com.jacklab.sb02.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello~";
	}
	
	// Don't use @ResponseBody
	@RequestMapping("/success")
	public String success(Map<String,Object> param) {
		param.put("name", "<b>Jack Xu</b>");
		param.put("users", Arrays.asList("aaa","bbb","ccc"));
		//classpath:templates/*.html
		return "success";
	}
}
