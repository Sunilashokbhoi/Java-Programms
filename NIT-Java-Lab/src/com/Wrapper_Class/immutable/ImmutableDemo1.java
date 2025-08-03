package com.Wrapper_Class.immutable;
class Product{
	protected double price;
	public Product (double price) {
		super();
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
public class ImmutableDemo1 {
	public static void main(String[] args) {
		Product laptop = new Product(67000);
		System.out.println("Before Changing : "+laptop.getPrice());
		accept(laptop);
		System.out.println("After Changing "+laptop.getPrice());
	}
	public static void accept(Product prod) {
		prod.setPrice(90000);
	}
}
