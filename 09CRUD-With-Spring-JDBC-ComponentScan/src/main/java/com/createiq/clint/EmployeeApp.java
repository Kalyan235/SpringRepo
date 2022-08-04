package com.createiq.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.createiq.controller.EmployeeController;
import com.createiq.model.Employee;

public class EmployeeApp {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeController employeeController = applicationContext.getBean("empController", EmployeeController.class);
		Employee employee = new Employee(112, "Sriman maahi");
		employeeController.update(employee);

	}

}
