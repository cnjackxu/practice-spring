package com.jacklab.sb02.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jacklab.sb02.dao.EmployeeDao;
import com.jacklab.sb02.entities.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao empDao;
	
	// Query all emps
	@GetMapping("/emps")
	public String list(Model model) {
		
		Collection<Employee> emps=empDao.getAllEmp();
		System.out.println("=======>"+emps.toString());
		// put into request scope
		model.addAttribute("emps",emps);
		
		return "emp/list";
	}
	
	@GetMapping("/emp")
	public String addEmpPage() {
		
		return "emp/add";
	}
}
