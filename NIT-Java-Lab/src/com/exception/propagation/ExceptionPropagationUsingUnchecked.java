package com.exception.propagation;

import java.util.Scanner;

public class ExceptionPropagationUsingUnchecked {
	public static void main(String[] args) {
		System.out.println("Main Method is Started ...");
		try {
			m1();
		}
		catch(ArithmeticException e) {
			System.err.println("Handled By Main...");
		}
		System.out.println("Main method is ended ...");
		
	}
	public static void m1() {
		System.out.println("M1 method is Started !!!");
		m2();
		System.out.println("M1 is ended !!!");
	}
	public static void m2() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the value of X : ");
		int x =  sc.nextInt();
		System.out.println("Enter the value of Y :");
		int y = sc.nextInt();
		int res = x/y;
		System.out.println("Result is : "+res);
		sc.close();
	}
}
