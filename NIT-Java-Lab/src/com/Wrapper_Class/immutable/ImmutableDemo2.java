package com.Wrapper_Class.immutable;

public class ImmutableDemo2 {
	public static void main(String[] args) {
		Integer i = new Integer(90);
		accept(i);
		System.out.println(i);
	}
	public static void accept(Integer y) {
		y = 120;
	}
}
