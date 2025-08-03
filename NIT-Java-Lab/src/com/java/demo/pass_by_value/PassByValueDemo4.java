package com.java.demo.pass_by_value;

public class PassByValueDemo4 {
	public static void main(String[] args) {
		Product p1 = new Product();
		accept(p1);
		System.out.println(p1);
	}
	public static void accept(Product prod) {
		prod = new Product();
		prod.setProductPrice(18000);
	}
}
