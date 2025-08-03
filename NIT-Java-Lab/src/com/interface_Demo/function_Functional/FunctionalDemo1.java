package com.interface_Demo.function_Functional;

public class FunctionalDemo1 {
	public static void main(String[] args) {
		Function<Integer,Integer> fn1 = num -> num*num*num;
		System.out.println(fn1.apply(5));
	}
}
