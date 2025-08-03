package com.java.demo.pass_by_value;

public class PassByValueDemo2 {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		x = accept(x);
		System.out.println(x);
	}
	public static int accept(int y) {
		y=100;
		return y;
	}
}