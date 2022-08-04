package com.createiq.datasource.demo;

import java.beans.PropertyVetoException;


import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestConnection {

	public static void main(String[] args) {

		System.out.println("--------------------DBCP------------------------");
		BasicDataSource basicDataSource = new BasicDataSource();

		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/kalyan");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");

		try {
			System.out.println(basicDataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		try {
			comboPooledDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
			comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/kalyan");
			comboPooledDataSource.setUser("root");
			comboPooledDataSource.setPassword("root");
			System.out.println("--------------------C3PO------------------------");
			System.out.println(comboPooledDataSource.getConnection());
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------Spring Based------------------------");

		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/kalyan");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
