package com.controller;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	public void add(Employee employee) {

		System.out.println("Employee Controller add method: " + employee);

		employeeService.add(employee);
	}

}
