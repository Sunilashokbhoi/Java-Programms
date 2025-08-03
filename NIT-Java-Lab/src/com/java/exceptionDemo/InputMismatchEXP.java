package com.java.exceptionDemo;

import java.util.Scanner;

public class InputMismatchEXP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Salary :");
		double salary = sc.nextDouble();
		System.out.println("Your salary is : "+salary);
	}
}
