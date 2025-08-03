package com.exception.nestedException;

public class ReturnExample1 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	public static int m1() {
		try {
			System.out.println("Industry try");
			return 100;
		}
		catch(Exception e) {
			System.out.println("inside try");
			return 200;
		}
		finally
		{
			System.out.println("Inside Finally");
			return 300;
		}
		
	}
}
