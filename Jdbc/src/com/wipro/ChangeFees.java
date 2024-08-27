package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ChangeFees {
	public static void main(String args[]) {
		Double fee=Double.valueOf(args[1]);
		int rollno=Integer.parseInt(args[0]);
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/prp","root","Sumanth@123");  
			//here sonoo is database name, root is username and password  
			PreparedStatement stmt=con.prepareStatement("update students set fees=? where rollno=?");  
			stmt.setDouble(1, fee);
			stmt.setInt(2, rollno);
			int i=stmt.executeUpdate();
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
	}  
	
}

