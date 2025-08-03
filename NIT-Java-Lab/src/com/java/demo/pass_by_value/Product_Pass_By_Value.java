package com.java.demo.pass_by_value;

public class Product_Pass_By_Value {
	public static void main(String[] args) {
		Product p1 = new Product();
		accept(p1);
		System.out.println(p1);
	}
	public static void accept(Product prod) {
		prod.setProductPrice(18000);
	}
}
