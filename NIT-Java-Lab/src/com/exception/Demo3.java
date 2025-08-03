package com.exception;

public class Demo3 {
	public static void method() throws ArithmeticException{
		throw new ArithmeticException();
	}
	public static void main(String[] args) {
		try {
			method();
		}
		catch (ArithmeticException e) {
			System.out.println("Catch main method()");
		}
	}
}
