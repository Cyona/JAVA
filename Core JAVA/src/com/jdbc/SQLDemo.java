package com.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDemo {
	
	public static void main(String[] args) throws IOException, SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");//create connection
		Statement stmt=con.createStatement(); //create statement/query
		String s="insert into employee values(002,'Steve','Baretto','Finance',80000);";
		String s1="update student set sname='Kripa' where marks=87";
		String s2="delete from student where sno=102";
		stmt.execute(s); //Executing statement/query
		con.close(); //close connection
	}

}
