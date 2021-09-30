package com.employeepayroll;

import java.util.Scanner;

public class EmployeePayRoll {
	public static void main(String[] args) {
		EmployeePayRollServices employeePayRollService = new EmployeePayRollServices();
		Scanner scanner = new Scanner(System.in);

		final int EXIT = 10;
		int choice = 0;
		while (choice != EXIT) {
			System.out.println(
					"enter your choice\n1. Get employee data\n2. update basic pay\n3. display employee roll\n4. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				String query = "select * from employee_payroll";
				employeePayRollService.getData(query);
				employeePayRollService.print();
				break;

			case 2:
				System.out.println("enter employee name");
				String empName = scanner.next();
				System.out.println("enter basic pay you want to update");
				double basicPay = scanner.nextDouble();
				employeePayRollService.updateData(empName, basicPay);
				break;

			case 3:
				employeePayRollService.print();
			case 4:
				System.out.println("exit");
			}
		}
	}
}
