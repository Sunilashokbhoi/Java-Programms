package com.Overriding.polymorphic_behavior;
class Payment1{
	public double makePayment(double amount) {
		System.out.println("Payment is in process...");
		return 0.0;
	}
}
class UPI1 extends Payment1{
	public double makePayment(double amount) {
		System.out.println("Making a payment of "+amount+ "by using upi");
		return 0.0;
	}
	public void offer() {
		System.out.println("2 days Holiday in GOA");
	}
}
class CreditCard1 extends Payment1{
	public double makePayment(double amount) {
		System.out.println("making a payment of "+amount +"by using Creditcard");
		return 0.0;
	}
	public void offer() {
		System.out.println("Get 1000 RS cash back offer");
	}
}
public class PolymorphicBehavior2 {
	public static void main(String[] args) {
		Payment p = null;
		p = new UPI();
		acceptPayment(p);
		
		p = new CreditCard();
		acceptPayment(p);
	}
	public static void acceptPayment(Payment payment) {
		UPI upi = (UPI) payment;
		upi.makePayment(12000);
		upi.offer();
	}
}
