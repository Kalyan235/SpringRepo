package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void add(Employee employee) {

		System.out.println("Employee Service add method: " + employee);

		employeeDao.add(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);
		
	}

	@Override
	public void deleteById(Integer eid) {
		employeeDao.deleteById(eid);
		
	}
}
