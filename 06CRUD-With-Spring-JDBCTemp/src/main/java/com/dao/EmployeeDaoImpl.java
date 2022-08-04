package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(Employee employee) {

		jdbcTemplate.update("insert into emp_spg values(?,?)",new Object[] {employee.getEid(),employee.getEname()});

	}

	@Override
	public void update(Employee employee) {
		jdbcTemplate.update("update emp_spg set Ename= ? where Eid=?",new Object[] {employee.getEname(),employee.getEid()});
		
	}

	@Override
	public void deleteById(Integer eid) {

		jdbcTemplate.update("delete from emp_spg where eid = ?",new Object[] {eid}); 
	}

}
