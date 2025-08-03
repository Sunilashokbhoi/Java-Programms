package com.java.inheritance_demo;

class Father1 {
	public Father1() {
		//super();
	}
	protected double balance = 50000;
}
class Son1 extends Father{

	public Son1() {
		super();
	}
	protected double balance = 18000;
	public void showBalance() {
		
		System.out.println("Son Balance is :"+this.balance);
		System.out.println("Fathet Balance is :"+this.balance);
	}
	
}
public class Variable_Hiding_Demo1 {
		public static void main(String[] args) {
			Son1 s = new Son1();
			s.showBalance();
		}
}
