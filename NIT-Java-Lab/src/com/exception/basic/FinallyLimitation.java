package com.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyLimitation {
	public static void main(String[] args) {
		Scanner sc =  null;
		
	try {
		sc = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age = sc.nextInt();

	}
	catch(InputMismatchException e) {
		System.err.println("Input mismatched..");
		//System.exit(0);
	}
	finally {
		System.out.println("inside finally");
		sc.close();
	}
	}
}
