package com.inheritance_programs.lambda;

import java.util.Scanner;
import java.util.function.Predicate;
//interface Predictable{
//	boolean predict(int x); 
//}

public class EvenOrOdd {
	public static void main(String[] args) {
		Predictable p1 = num ->
		{
			return num % 2 == 0;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int no = sc.nextInt();
		boolean isEven = p1.predict(no);
		System.out.println("Is "+no+" even number " +isEven);
	}
}
