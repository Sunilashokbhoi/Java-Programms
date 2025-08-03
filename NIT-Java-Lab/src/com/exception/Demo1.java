package com.exception;

import java.io.IOException;
public class Demo1 {
	public static int dividenum(int a , int b) {
		int div = a/b;
		return div;
	}
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		try {
			System.out.println(obj.dividenum(10, 0));
		}
		catch(ArithmeticException e) {
			System.out.println("Number canot be divide "+e);
		}
		System.out.println("Rest of code");
	}
}
