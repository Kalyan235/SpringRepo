package com.service;

import com.model.Employee;

public interface EmployeeService {
	
	public void add(Employee employee);
	
	public void update(Employee employee);

	public void deleteById(Integer eid);


}
