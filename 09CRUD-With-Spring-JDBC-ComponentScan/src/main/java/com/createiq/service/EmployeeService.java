package com.createiq.service;

import com.createiq.model.Employee;

public interface EmployeeService {
	
	public void add(Employee employee);
	
	public void update(Employee employee);

	public void deleteById(Integer eid);


}
