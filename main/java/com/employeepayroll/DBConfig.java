package com.employeepayroll;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

	public Connection getConnection() {
		String URL_JD = "jdbc:mysql://localhost:3306/payroll_service";
		String USER = "root";
		String PASSWORD = "damini@99";
		Connection connection = null;
		try {
			// load jdbc
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			connection = DriverManager.getConnection(URL_JD, USER, PASSWORD);
			System.out.println("Connection is succesful");
		} catch (ClassNotFoundException e) {
			throw new EmployeeException("invalid driver");
		} catch (SQLException e) {
			throw new EmployeeException("Sql exception");
		}
		return connection;

	}

}
