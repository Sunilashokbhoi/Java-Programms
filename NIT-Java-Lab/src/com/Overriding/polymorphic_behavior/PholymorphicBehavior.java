package com.Overriding.polymorphic_behavior;
class Payment{
	public double makePayment(double amount) {
		System.out.println("Payment is in process...");
		return 0.0;
	}
}
class UPI extends Payment{
	public double makePayment(double amount) {
		System.out.println("Making a Payment of "+amount+"using UPI");
		return amount;
	}
}
class CreditCard extends Payment{
	public double makePayment(double amount) {
		System.out.println("MAKING A payment of "+amount+"Using Credit card");
		return amount;
	}
}
public class PholymorphicBehavior {
	public static void main(String[] args) {
		Payment p1 = null;
		p1 = new UPI();
		acceptaPayment(p1);
		p1 = new CreditCard();
		acceptaPayment(p1);
		
	}
	public static void acceptaPayment(Payment payment) {
		payment.makePayment(12000);
	}
}
