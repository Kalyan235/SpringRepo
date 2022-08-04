package com.service;

import com.dao.StudentDao;
import com.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void add(Student student) {

		System.out.println("Student service add method: " + student);
		studentDao.add(student);
	}

}
