package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Product;

public class ProductDaoImpl implements ProductDao {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void add(Product product) {

		System.out.println("P Dao");

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement("insert into Product_Tab values (?,?)");
			preparedStatement.setInt(1, product.getPid());
			preparedStatement.setString(2, product.getName());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
