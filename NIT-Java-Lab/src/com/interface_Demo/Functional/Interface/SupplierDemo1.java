package com.interface_Demo.Functional.Interface;

public class SupplierDemo1 {
	public static void main(String[] args) {
		Supplier<String> s1 = ()-> 12 + 90 +" + "+34;
		String data = s1.get();
		System.out.println(data);
	}
}
