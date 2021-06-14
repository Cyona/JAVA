package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDemo2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		Statement stmt=con.createStatement();
		String s="select * from employee";
		ResultSet rs=stmt.executeQuery(s);
		while(rs.next()) {
			int sid=rs.getInt("sno");
			String name=rs.getString("sname");
			int smarks=rs.getInt("marks");
			
			System.out.println(sid+"  "+name+"  "+smarks);
		}
		
		con.close();
		

	}

}
