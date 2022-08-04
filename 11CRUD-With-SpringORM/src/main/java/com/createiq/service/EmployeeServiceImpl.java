package com.createiq.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.dao.EmployeeDao;
import com.createiq.dao.EmployeeDaoImpl;
import com.createiq.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

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
