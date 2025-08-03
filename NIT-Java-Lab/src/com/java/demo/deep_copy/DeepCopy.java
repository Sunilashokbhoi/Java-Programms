package com.java.demo.deep_copy;

public class DeepCopy {
	public static void main(String[] args) {
		Customer c1 = new Customer(12000);
		Customer c2 = new Customer();
		c2.setCustomerBill(c1.getCustomerBill());
		System.out.println("Before Changong ....");
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.setCustomerBill(15000);
		System.out.println("After ");
		System.out.println(c1);
		System.out.println(c2);
	}

}
