package com.exception.basic;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			System.out.println("Inside Try!!!");
			throw new OutOfMemoryError();
		}
		catch(Exception e) {
			System.out.println("Inside Catch!!!");
			System.out.println(e);
		}
		
	}
}
