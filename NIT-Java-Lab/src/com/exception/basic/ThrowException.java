package com.exception.basic;

public class ThrowException {
	public static void main(String[] args) {
		try {
			System.out.println("operation"+10/20);
			throw new ArithmeticException("Ravi is dividing a number by zero");
		}
		catch(Exception e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
		System.out.println("Main complated!!!!");
	}
}
