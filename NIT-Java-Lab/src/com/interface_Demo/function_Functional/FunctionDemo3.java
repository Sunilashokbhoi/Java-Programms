package com.interface_Demo.function_Functional;

import java.util.Scanner;

public class FunctionDemo3 {
	public static void main(String[] args) {
		Function<String,Boolean> fn3 = str ->str.equals("Ravi");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name ");
		String name = sc.next();
		Boolean isRavi = fn3.apply(name);
		if(isRavi) {
			System.out.println("Yes He is Ravi");
		}
		else {
			System.err.println("No He is Not Ravi");
			sc.close();
		}
	}
}
