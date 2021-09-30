package com.employeepayroll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayRollServices {
	DBConfig dbConfig = new DBConfig();
	Connection con = dbConfig.getConnection();
	ArrayList<Employee> empList;
	PreparedStatement preparedStatement;

	public ArrayList<Employee> getData(String sql) {
		String Fetch = sql;
		System.out.println(Fetch);
		empList = new ArrayList<Employee>();
		try {
			preparedStatement = con.prepareStatement(Fetch);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee();

				employee.setID(resultSet.getInt("ID"));
				employee.setName(resultSet.getString("Name"));
				employee.setPhoneNumber(resultSet.getInt("PhoneNumber"));
				employee.setAddress(resultSet.getString("Address"));
				employee.setDepartment(resultSet.getString("Department"));
				employee.setStart(resultSet.getString("Start"));
				employee.setBasicPay(resultSet.getDouble("BasicPay"));
				employee.setDeductions(resultSet.getDouble("Deductions"));
				employee.setTaxablePay(resultSet.getDouble("TaxablePay"));
				employee.setIncomeTax(resultSet.getDouble("IncomeTax"));
				employee.setNetPay(resultSet.getDouble("NetPay"));

				empList.add(employee);
			}

//			for (Employee i : empList) {
//				System.out.println(i.toString());
//			}
		} catch (SQLException e) {
			throw new EmployeeException("invalid column label");
		}
		return empList;
	}

	public void print() {
		for (Employee i : empList) {
			System.out.println(i.toString());
		}
	}

	public double updateData(String emp, double basicPay) {
		Connection con = dbConfig.getConnection();
		String UPDATE = "UPDATE employee_payroll SET BasicPay = ? WHERE Name = ?";
		Scanner scan = new Scanner(System.in);
		try {
			preparedStatement = con.prepareStatement(UPDATE);
			preparedStatement.setDouble(1, basicPay);
			preparedStatement.setString(2, emp);
			preparedStatement.executeUpdate();
			System.out.println("update successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String sql = "SELECT * FROM employee_payroll";
		getData(sql);
		for (Employee data : empList) {
			if (data.getName().equals(emp)) {
				return data.getBasicPay();
			}
		}
		return 0.0;
	}

}
