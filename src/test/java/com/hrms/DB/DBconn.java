package com.hrms.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class DBconn {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	//jdbc: driver type: hostname:port/DB name
	String dbURL = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";
	
	@Test
	public void abc() throws SQLException{
		Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		System.out.println("DB connection is sucessful");
	}
}
