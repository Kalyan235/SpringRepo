package com.clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.StudentController;
import com.model.Student;

public class StudentApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		StudentController studentController = applicationContext.getBean("stuController", StudentController.class);
		Student student = new Student(101, "Octavia", 250000);
		studentController.add(student);
	}

}
