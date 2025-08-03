package com.java.demo.pass_by_value;

public class Product {
	private double productPrice = 12000;
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String toString() {
		return "Product [productPrice "+ productPrice+"]";
	}
}
