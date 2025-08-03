package com.java.Assignment_3;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee(int employeeId ,String employeeName ,double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public static Employee getEmployeeObject() {
		return new Employee(101,"Sunil",15000);
		
	}

	//@Override
	//public String toString() {
	//	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
	//			+ employeeSalary + "]";
	
	public String toString() {
		return "Employee [employeeId "+ employeeId + "employeeName "+ employeeName +"employeeSalary = "+employeeSalary+"]";
	}
	}
