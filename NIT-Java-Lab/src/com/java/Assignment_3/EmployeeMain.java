package com.java.Assignment_3;
import java.util.Scanner;
public class EmployeeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//for(int i=1 ; i<=5 ;i++) {
		System.out.println("Enter Employee ID ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = sc.next();
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(id,name,salary); 
		System.out.println(emp.toString());
		
		sc.close();
		
	}
}
