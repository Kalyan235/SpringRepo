package com.controller;

import com.model.Student;
import com.service.StudentService;

public class StudentController {
	
	private StudentService studentService;
	
	
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}



	public void add(Student student) {
		
		System.out.println("Student Controller add method: "+student);
		
		studentService.add(student);
	}

}
