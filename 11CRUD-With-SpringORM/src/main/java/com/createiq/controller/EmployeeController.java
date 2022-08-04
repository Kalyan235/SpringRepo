package com.createiq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;
import com.createiq.service.EmployeeServiceImpl;

@Controller("empController")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void add(Employee employee) {

		System.out.println("Employee Controller add method: " + employee);

		employeeService.add(employee);
	}

	public void update(Employee employee) {

		employeeService.update(employee);
	}

	public void deleteById(Integer eid) {

		employeeService.deleteById(eid);
	}
}
