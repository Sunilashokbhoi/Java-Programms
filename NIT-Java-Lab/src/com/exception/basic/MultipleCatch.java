package com.exception.basic;

public class MultipleCatch {
	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			int c = 10 / 2;
			System.out.println("c value is " + c);
			int[] x = { 12, 78, 56 };
			System.out.println(x[4]);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.err.println("array is out of limit");
		} catch (ArithmeticException e1) {
			System.err.println("dividing by zero problem");
		}
		catch(Exception e1) {
			System.err.println("General ");
		}
		System.out.println("main ended...");

	}
}
