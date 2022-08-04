package com.createiq.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

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
