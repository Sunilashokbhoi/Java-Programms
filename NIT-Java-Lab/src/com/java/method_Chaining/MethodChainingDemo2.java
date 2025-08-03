package com.java.method_Chaining;

public class MethodChainingDemo2 {
	public static void main(String[] args) {
		String str = "Hydrabad ";
		String str2 = "IS ";
		String str3 = "City ";
		String strf = str.concat(str2).concat(str3).toUpperCase();
		System.out.println(strf);
		}
}
