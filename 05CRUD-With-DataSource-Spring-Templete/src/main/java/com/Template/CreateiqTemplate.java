package com.Template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CreateiqTemplate {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void exicuteUpdate(String query,Object[] params) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(query);
		    for(int i=0; i<params.length;i++) {
		    	
		    	preparedStatement.setObject(i+1, params[i]);
		    }
			preparedStatement.executeUpdate();
			connection.commit();
		} catch (SQLException e) {

			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
