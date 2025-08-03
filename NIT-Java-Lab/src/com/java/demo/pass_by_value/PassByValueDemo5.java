package com.java.demo.pass_by_value;

public class PassByValueDemo5 {
	public static void main(String[] args) {
		String str = new String("Hyd");
		accept(str);
		System.out.println(str);
				}
	public static void accept(String s1) {
		s1 = "India";
	}
}
