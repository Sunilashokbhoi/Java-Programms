package com.java.demo.shallow_copy;

public class Shallow {
	public static void main(String[] args) {
		Laptop lp = new Laptop("Hp",15000);
		Laptop lp2 =lp;
		System.out.println("Before Change...");
        System.out.println(lp);
        System.out.println(lp2);
        
        System.out.println("After Change...");
        lp2.setLaptopBrand("Dell");
        lp2.setLaptopPrice(90000);
        System.out.println(lp);
        System.out.println(lp2);
        
	}
}


