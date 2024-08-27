package com.wipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowRecord {
	public static void main(String args[]) {
		int rollno=1004;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/prp","root","Sumanth@123");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from prp.students where rollno="+rollno);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getDouble(5));
			}
		}
		catch(Exception e){ 
			System.out.println(e);
		}  
	}
}
