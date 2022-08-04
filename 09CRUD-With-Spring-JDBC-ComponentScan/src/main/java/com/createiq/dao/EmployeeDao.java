package com.createiq.dao;

import com.createiq.model.Employee;

public interface EmployeeDao {

	public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void deleteById(Integer eid);

}
