package com.interface_Demo.predefined.Function;

import java.util.Scanner;

public class PredicateDemo1 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = age ->
		{
			return age >=18;
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :");
		int age = sc.nextInt();
		
		boolean isEligible = p1.test(age);
		if(isEligible)
		{
			System.out.println("You are eligible for Voting");
		}else {
			System.out.println("you are Not Eligible for Voting");
		}
		sc.close();
	}
}
