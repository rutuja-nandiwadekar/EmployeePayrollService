package com.blz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeeData> employePayrollList = new ArrayList<EmployeeData>();
	Scanner scanner = new Scanner(System.in);

	/*
	 * @purpose: This is the method to read the employee data from console.
	 */
	public void readEmployeeDataFromConsole() {
		System.out.println("Enter Employee Id");
		int id = scanner.nextInt();
		System.out.println("Enter Employee Name");
		String Name = scanner.next();
		System.out.println("Enter the salary");
		int salary = scanner.nextInt();
		employePayrollList.add(new EmployeeData(id, Name, salary));
	}

	/*
	 * @purpose: This is the method to write the employee data in console.
	 */
	public void writeEmployeeDataInConsole() {
		System.out.println("Employee PayRoll Data \n" + employePayrollList);
	}

	// main
	public static void main(String[] args) {
		System.out.println("..WELCOME TO EMPLOYEE PAYROLL SYSTEM..");
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.readEmployeeDataFromConsole();
		employeePayrollService.writeEmployeeDataInConsole();
	}
}