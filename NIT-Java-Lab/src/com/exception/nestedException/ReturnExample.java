package com.exception.nestedException;

public class ReturnExample {
	public static void main(String[] args) {
		System.out.println(methodReturningValue());
		
	}
	public static int methodReturningValue() {
		try {
			System.out.println("Try block");
			return 10/0;
		}
		catch (Exception e) {
			System.out.println("Catch block");
			return 20;
		}
	}
}
