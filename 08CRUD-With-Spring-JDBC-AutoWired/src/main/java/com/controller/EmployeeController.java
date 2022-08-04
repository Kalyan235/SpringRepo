package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

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
