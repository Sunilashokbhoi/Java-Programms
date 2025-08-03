package com.exception.basic;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {
		System.out.println("Hello Client, Welcome to my application...");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the value of X ");
			int x = sc.nextInt();
			System.out.println("Enter the value of Y :");
			int y = sc.nextInt();
			int result = x / y;
			System.out.println("Result is :" + result);

		} catch (Exception e) {
			System.err.println("Please don't put zero here ");
		}
		System.out.println("Thank you for visiting my application !!");
		sc.close();
	}
}
