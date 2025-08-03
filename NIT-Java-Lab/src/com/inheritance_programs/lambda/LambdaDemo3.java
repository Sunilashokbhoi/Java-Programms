package com.inheritance_programs.lambda;

import java.util.Scanner;

interface Length{
	public abstract int findLength(String str);
}
public class LambdaDemo3 {
	public static void main(String[] args) {
		Length length = str -> str.length();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter your city Name");
		String cityName = sc.next();
		System.out.println("Length Of "+cityName+"is :"+length.findLength(cityName));
		sc.close();
	}
}
