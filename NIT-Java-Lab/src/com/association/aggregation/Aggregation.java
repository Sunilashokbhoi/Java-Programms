package com.association.aggregation;

import java.net.CookieHandler;

public class Aggregation {
	public static void main(String[] args) {
		Colllege clg = new Colllege("VIT","Vellore");
		Student s1 = new Student(1, "Scott", 450, clg);
		System.out.println(s1);
		Colllege clgs = new Colllege("DNP","Shahada");
		Student s2 = new Student(2,"Smith", 453, clgs);
		System.out.println(s2);
	}
}
