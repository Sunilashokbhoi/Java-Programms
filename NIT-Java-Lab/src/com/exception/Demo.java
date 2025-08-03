package com.exception;
//
//import java.util.Scanner;
//
//public class Demo {
//	public static void main(String[] args) {
//		System.out.println("main is starting");
//		Scanner sc = new Scanner(System.in);
//		int x =sc.nextInt();
//		int y =sc.nextInt();
//		try {
//		int c = x/y;
//		System.out.println("Answer is "+c);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("by zero exception +"+e );
//		}
//	}
//}
//
//public class Demo {
//	public static void main(String[] args) {
//		try {
//			//System.out.println(10/0);
//			throw new ArithmeticException("Not any type of inputs ");
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}

public class Demo {
	public static void main(String[] args) {
		try {
			
			try {
				int b = 39/0;
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[] = new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("D"+e);
			}
		}
		catch(Exception e) {
			System.out.println("handle the exception (outer catch)");
		}
		System.out.println("Normal flow");
	}
}