package com.employeepayroll;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeePayRoll {

	public static void main(String[] args) {
		DBConfig dbConfig = new DBConfig();
		dbConfig.getConnection();
		String Fetch = "select * from employee_payroll";
		ArrayList<Employee> empList = new ArrayList<Employee>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = dbConfig.getConnection().prepareStatement(Fetch);
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
			for (Employee i : empList) {
				System.out.println(i.toString());
			}
		} catch (SQLException e) {
			throw new EmployeeException("invalid column label");
		}
	}

}
