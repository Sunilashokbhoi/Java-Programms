package com.Wrapper_Class.immutable.AutoBoxing;

public class AutoBoxing4 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1==i2);  // false
		System.out.println(i1);
		Integer a1 =Integer.valueOf(15);
		Integer a2 =Integer.valueOf(15);
		System.out.println(a1 == a2);
	}
}
