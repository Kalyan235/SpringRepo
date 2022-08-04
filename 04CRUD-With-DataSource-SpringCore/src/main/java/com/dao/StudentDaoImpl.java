package com.dao;

import com.model.Student;

public class StudentDaoImpl implements StudentDao {

	public void add(Student student) {

		System.out.println("Student Dao add method: " + student);
	}

}
