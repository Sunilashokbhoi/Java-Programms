package com.interface_Demo;
interface Bank{
	void deposit(double amount);
	void withdraw(double amount);
}
class Customer implements Bank{
	protected double balance;
	public Customer(double balance) {
		super();
		this.balance = balance;
	}
	public void deposit(double amount) {
		 if(amount <= 0) {
			 System.out.println("Amount can't be deposited");
			 System.exit(0);
		 }else
			 this.balance = this.balance+amount;
		 System.out.println("Balance after deposite "+amount+ " : "+this.balance);
	}
	public void withdraw(double amount) {
		if(amount > this.balance) {
			System.err.println("Insufficient Balance!!");
			System.exit(0);
		}else {
			this.balance = this.balance - amount;
			System.out.println("Amount After Withdraw "+amount+" is :"+this.balance);
		}
	}
	public double getCurrentBalance() {
		return this.balance;
	}
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
	Customer scott = new Customer(1000);
	System.out.println("Current Balance is : "+scott.getCurrentBalance());
	scott.deposit(1000);
	scott.withdraw(500);
	}
}
