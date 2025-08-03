package com.interface_Demo.predefined.Function;

import java.util.Scanner;

public class PredicateDemo {
	public static void main(String[] args) {
	
	Predicate<Integer> n = n1-> {
		return n1%2==0;
	};
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt(); 
	boolean even = n.test(num);
	System.out.println(even);
}
}
