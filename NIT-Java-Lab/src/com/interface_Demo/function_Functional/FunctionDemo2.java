package com.interface_Demo.function_Functional;

import java.util.Scanner;

public class FunctionDemo2 {
	public static void main(String[] args) {
		
	Function<String,Integer> fn2 = city ->city.length();  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your City Name ?");
	String city = sc.next();
	System.out.println("The length of "+city+" is :"+fn2.apply(city));
	sc.close();
	}
}
