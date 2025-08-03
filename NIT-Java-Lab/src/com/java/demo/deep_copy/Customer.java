package com.java.demo.deep_copy;

public class Customer {
	private double customerBill;
	
	public Customer() {
		customerBill = 0.0;
	}
	public Customer(double customerBill) {
		super();
		this.customerBill = customerBill;
	}
	public String toString() {
		return "Customer[customerBill="+customerBill+"]";
	}
	public double getCustomerBill() {
		return customerBill;
	}
	public void setCustomerBill(double customerBill) {
		this.customerBill = customerBill;
	}
	
}
