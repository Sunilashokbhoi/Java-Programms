package com.exception;

public class ExceptionSuper {
	public static void main(String[] args) {
		Exception e1 = new ArithmeticException("Ravi divides by zero");
		System.out.println(e1.toString());
		
		Exception e2 = new InterruptedException();
		System.out.println(e2.toString());
	}
}
