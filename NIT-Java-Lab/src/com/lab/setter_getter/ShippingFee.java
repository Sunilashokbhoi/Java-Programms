package com.lab.setter_getter;

public class ShippingFee {
	
	private double feeAmount;
	
	public double getFeeAmount() {
		return feeAmount;
	}
	public static ShippingFee calculateFee(Package pkg) {
		ShippingFee sf = new ShippingFee();
		double weight = pkg.getPackageWeight();
		int distance = pkg.getShippingDistance();
		
		if(weight <= 5) {
			if(distance <= 100 ) {
				sf.feeAmount = 5;
			}else if(distance > 100) {
				sf.feeAmount = 10;
			}
		}else 
			if(weight >5 && weight <= 20) {
				if(distance <= 100 ) {
					sf.feeAmount = 10;
				}else 
					if(distance > 100) {
						sf.feeAmount = 20;
					}
			}else
				if(weight > 20) {
					if(distance <= 100) {
						sf.feeAmount = 20;
					}else 
						if(distance > 100) {
							sf.feeAmount = 40;
						}
				}
		return sf;
	}
}
