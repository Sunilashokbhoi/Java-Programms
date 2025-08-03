package com.lab.constructore;

class Product {
	private String productName;
	private int productId ;
	private double price;
	
	 Product() {
		System.out.println("Deafault ");
		System.out.println("Product Name "+productName);
		System.out.println("Product Id  :"+productId);
		System.out.println("Price "+price);
	}
	 Product(String productName,int productId,double price) {
	
		this.productName = productName;
		this.productId = productId;
		this.price = price;
	}
	public void display_info() {
		if(productName.isBlank()) {
			System.out.println("Product name cannot be null or empty");
		} else {
			System.out.println("Product Name: "+productName);
		}
		if(productId <=0) {
			System.out.println("Product ID cannot be negative");
		}else {
			System.out.println("Product ID "+productId);
		}
		if(price <=0) {
			System.out.println("Price cannot be negative");
		}else {
			System.out.println("Price: "+price);
		}
		
	}
}
public class ProductTester {
	public static void main(String[] args){
		Product p = new Product("",101,-123);
		p.display_info();
	}
}
