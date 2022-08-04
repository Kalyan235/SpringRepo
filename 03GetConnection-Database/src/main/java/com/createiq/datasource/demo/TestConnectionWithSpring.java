package com.createiq.datasource.demo;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConnectionWithSpring {

	public static void main(String[] args) {

		System.out.println("--------------------dbcp--------------------------------");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		DataSource dataSource = (DataSource) applicationContext.getBean("dbcpDS");

		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------c3po--------------------------------");

		DataSource dataSourceC3po = (DataSource) applicationContext.getBean("c3poDS");

		try {
			System.out.println(dataSourceC3po.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------spring--------------------------------");

		DataSource dataSourceSpring = (DataSource) applicationContext.getBean("c3poDS");

		try {
			System.out.println(dataSourceSpring.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
