package com.interface_.Static_Method;

public class Calculation {
	public static void main(String[] args) {
	double result =	Calculator.getCube(8);
	System.out.println("Cube of 8 is :"+result);
	result = Calculator.getSquare(12);
	System.out.println("Square of 12 is :"+result);
	}
}
