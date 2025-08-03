package com.Overriding.polymorphic_behavior;

import javax.security.cert.CertificateEncodingException;

class Payment2{
	public double makePayment(double amount) {
		System.out.println("Payment is in process...");
		return 0.0;
	}
}

class UPI2 extends Payment2{
	@Override
	public double makePayment(double amount) {
		System.out.println("Making a Payment of "+ amount +"by using UPI");
		return 0.0;
	}
	
	public void offer2() {
		System.out.println("2 days Holiday in GOA");
	}
}
class CreditCard2 extends Payment2{
	@Override
	public double makePayment(double amount) {
		System.out.println("making payment of "+amount +"by using credit card");
		return 0.0;
	}
	public void offer2() {
		System.out.println("Get 1000 rs cash bacj offer");;
	}
}
class DebitCard extends Payment2{
	@Override
	public double makePayment(double amount) {
		System.out.println("Making a payment of "+amount+"by using debitcard");
		return 0.0;
	}
}
public class PolymorphicBehavior3 {
	public static void main(String[] args) {
		UPI u = new UPI();
		CreditCard cc = new CreditCard();
		DebitCard dc = new DebitCard();
		
		 acceptPayment2(u,cc,dc);
	}
		public static void acceptPayment2(Payment ...payment)
		{
			for(Payment p : payment)
			{
				if(p instanceof UPI)
				{
					UPI upi = (UPI)p;
					upi.makePayment(15000);
					upi.offer2();
				}
				else if(p instanceof CreditCard)
				{
					CreditCard cc = (CreditCard) p;
					cc.makePayment(22000);
					cc.offer2();
				}
				else if(p instanceof DebitCard)
				{
					DebitCard d = (DebitCard) p;
					d.makePayment(12000);
				}
				
				else if(p instanceof Cash)
				{
					DebitCard d = (DebitCard) p;
					d.makePayment(12000);
				}
			}
		}
	}
}
