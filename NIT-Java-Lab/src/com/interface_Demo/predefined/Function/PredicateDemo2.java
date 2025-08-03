package com.interface_Demo.predefined.Function;

import java.util.Scanner;

public class PredicateDemo2 {
	public static void main(String[] args) {
		
		Predicate<String> p2 = str -> 
		str.equalsIgnoreCase("Ravi");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Name :");
	String name = sc.next();
	System.out.println("Are you Ravi :"+p2.test(name));
	sc.close();
	}
}
