package com.Overriding.method_overriding;
class Payment{
	public void makePayment() {
		System.out.println("Generic Payment");
	}
}
class Cash extends Payment{
	public void makePayment() {
		System.out.println("Payment theough Cash");
	}
}
class CreditCard extends Payment{
	public void makePayment() {
		System.out.println("Payment through Credit");
	}
}
class DebitCard extends Payment{
	public void makePayment() {
		System.out.println("Payment through DebitCard");
	}
}
public class MethodOverridingDemo1 {
	public static void main(String[] args) {
		Payment p = null;
		p = new Cash();
		p.makePayment();
		p= new DebitCard();
		p.makePayment();
		p = new CreditCard();
		p.makePayment();
	}
}
