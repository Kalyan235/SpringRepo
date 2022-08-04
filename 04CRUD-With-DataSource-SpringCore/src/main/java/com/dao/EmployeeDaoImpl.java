package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void add(Employee employee) {

		System.out.println("Employee Dao add method: " + employee);

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			//connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement("INSERT INTO EMP_SPG VALUES (?,?)");
			preparedStatement.setInt(1, employee.getEid());
			preparedStatement.setString(2, employee.getEname());
			preparedStatement.executeUpdate();
			//connection.commit();
		} catch (SQLException e) {

			e.printStackTrace();
//			try {
//				connection.rollback();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		} finally {
			try {
				preparedStatement.close();
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer eid) {
		// TODO Auto-generated method stub
		
	}

}
