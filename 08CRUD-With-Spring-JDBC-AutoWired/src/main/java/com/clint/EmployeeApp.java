package com.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmployeeController;
import com.model.Employee;

public class EmployeeApp {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeController employeeController = applicationContext.getBean("empController", EmployeeController.class);
		Employee employee = new Employee(111, "Palwan mama");
		employeeController.add(employee);

	}

}
