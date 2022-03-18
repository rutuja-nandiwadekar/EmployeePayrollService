package com.blz;

public class EmployeeData {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;

	public EmployeeData(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "EmployeeData [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
}
