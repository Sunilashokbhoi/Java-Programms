package com.exception;

public class Main {
	public static void main(String[] args) {
		
	}
	static {
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handling ");
		}
	}
}
