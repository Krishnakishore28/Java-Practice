package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	public Connection getConnectionDb() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/prp","root","Sumanth@123"); 
		return con;
	}
	
}
