package com.interface_Demo.predefined.Function;

import java.util.Scanner;

public class PredicateDemo3 {
	public static void main(String[] args) {
		Predicate <String> p3 = str ->
		str.startsWith("A");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Name");
		String name = sc.next();
		System.out.println("The name "+name+" start with character A ? "+p3.test(name));
		sc.close();
	}
}
