package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.Template.CreateiqTemplate;
import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private CreateiqTemplate createiqTemplate;
	

	public void setCreateiqTemplate(CreateiqTemplate createiqTemplate) {
		this.createiqTemplate = createiqTemplate;
	}

	public void add(Employee employee) {

		createiqTemplate.exicuteUpdate("insert into emp_spg values(?,?)",new Object[] {employee.getEid(),employee.getEname()});

	}

	@Override
	public void update(Employee employee) {
		createiqTemplate.exicuteUpdate("update emp_spg set Ename= ? where Eid=?",new Object[] {employee.getEname(),employee.getEid()});
		
	}

	@Override
	public void deleteById(Integer eid) {

		createiqTemplate.exicuteUpdate("delete from emp_spg where eid = ?",new Object[] {eid}); 
	}

}
