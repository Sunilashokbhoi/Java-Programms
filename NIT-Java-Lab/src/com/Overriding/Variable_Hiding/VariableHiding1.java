package com.Overriding.Variable_Hiding;
class RBI{
	protected String ifscCode = "RBIHYD0914567";
	public String loan() {
		return "Provide loan";
	}
}
class SBI extends RBI{
	protected String ifscCode = "SBIAMMERPET15679";
	public String loan() {
		return "9.2% ROI";
	}
}
public class VariableHiding1 {
	public static void main(String[] args) {
		RBI r = new SBI();
		System.out.println(r.ifscCode+" : "+r.loan());
	}
}
