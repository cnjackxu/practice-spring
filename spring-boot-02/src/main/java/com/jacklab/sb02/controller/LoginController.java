package com.jacklab.sb02.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping("/user/login")
	public String login(@RequestParam("userName") String userName,
						@RequestParam("password") String password,
						Map<String, Object> ret,
						HttpSession session) {
		System.out.println("==============>username:"+userName+", password:"+password);
		if(!StringUtils.isEmpty(userName) && "123".equals(password)) {
			session.setAttribute("loginUser", userName);
			return "redirect:/main.html";
		}
		
		ret.put("msg", "User name or password is incorrect" );
		return "signin";
	}
}
