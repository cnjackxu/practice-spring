package com.jacklab.sb02.dao;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jacklab.sb02.entities.Employee;


@Repository("empDao")
public class EmployeeDao {

	private static Map<Integer, Employee> emps=null;
	// simulate id increment
	private static Integer autoId=1101;
	static {
		emps=new HashMap<Integer,Employee>();
		emps.put(1001, new Employee(1001, "jack", "jack@lab.com",new Date(System.currentTimeMillis())));
		emps.put(1002, new Employee(1002, "tom", "tom@lab.com", new Date()));
		emps.put(1004, new Employee(1003, "jerry", "jerry@lab.com", new Date()));
	}
	
	// PUT
	public void saveEmp(Employee emp) {
		if(emp.getId()==null)
			emp.setId(autoId++);
		emps.put(emp.getId(), emp);
		
	}
	
	// GET
	public Collection<Employee> getAllEmp(){
		return emps.values();
	}
	
	// GET /{id}
	public Employee getEmp(Integer id) {
		return emps.get(id);
	}
	
	// DELETE /{id}
	public void delete(Integer id) {
		emps.remove(id);
	}
}
