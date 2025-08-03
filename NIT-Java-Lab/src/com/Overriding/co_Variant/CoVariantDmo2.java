package com.Overriding.co_Variant;
class RBI{
	public Object loan() {
		System.out.println("Bank should privide loan");
		return this;
	}
}
class SBI extends RBI{
	public Double loan() {
		System.out.println("Provideing loan @ 9.2% ROI");
		return null;
	}
}
public class CoVariantDmo2 {
	public static void main(String[] args) {
		RBI r = new SBI();
		r.loan();
	}
}
