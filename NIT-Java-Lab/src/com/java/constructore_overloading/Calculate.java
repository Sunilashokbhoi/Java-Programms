package com.java.constructore_overloading;
import java.text.DecimalFormat;
public class Calculate {
	
	public Calculate(int x,int y) {
		this(2.3,7.8);
		System.out.println("Sum Of two integer : "+(x+y));
	}
	public Calculate(double a, double b) {
		this("Data","Base");
		double sum = a + b;
		DecimalFormat df = new DecimalFormat("00.00");
		System.out.println("Sum of Twon double is: "+df.format(sum));
	}
	public Calculate(String a ,String b) {
		System.out.println("Concatenantion of two String "+(a+b));
	}
}
