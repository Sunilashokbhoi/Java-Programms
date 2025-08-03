package com.java.copy_constructore;

public class ProductTest {
public static void main(String[] args) {
	Product p = new Product(1,"Camera");
    System.out.println(p);
    
    Product p2 = new Product(p);
    		System.out.println(p2);
}
}
