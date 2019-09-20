package com.jacklab.sb03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/say")
	public String say() {
		return "hello";
	}
}
