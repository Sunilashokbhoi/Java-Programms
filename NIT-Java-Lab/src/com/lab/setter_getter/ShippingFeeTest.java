package com.lab.setter_getter;

public class ShippingFeeTest {
	public static void main(String[] args) {
		Package pk = new Package();
		pk.setPackageWeight(10);
		pk.setShippingDistance(150);
		pk.displayPackageDetails();
		ShippingFee object = ShippingFee.calculateFee(pk);
		System.out.println("Shipping Fees : "+object.getFeeAmount());
		
	}
}
