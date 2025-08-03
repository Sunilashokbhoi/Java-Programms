package com.interface_Demo.Binary_Operator;

public class Lambda16 {
	public static void main(String[] args) {
		BinaryOperator<Integer> add = (a,b) -> a + b;
		System.out.println(add.apply(3,5));
	}
}
