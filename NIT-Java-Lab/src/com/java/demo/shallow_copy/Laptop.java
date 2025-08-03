package com.java.demo.shallow_copy;

public class Laptop {
	private String laptopBrand;
	private double laptopPrice;
	public Laptop(String laptopBrand, double laptopPrice) {
		super();
		this.laptopBrand = laptopBrand;
		this.laptopPrice = laptopPrice;
	}
	@Override
	public String toString() {
		return "Laptop [laptopBrand=" + laptopBrand + ", laptopPrice=" + laptopPrice + "]";
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	public double getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	
	
}
