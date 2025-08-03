package com.multithreading.drawback_Of_Multithreading;
class Customer1{
	private double balance = 20000;
	private double amount;
		public Customer1(double amount) {
			this.amount = amount;
		}
		public synchronized void withdraw()
		{
			String name = null;
			
			if(this.balance>= this.amount) {
				name = Thread.currentThread().getName();
				System.out.println(this.amount+" amount has withdraw by :"+name);
				this.balance =  this.balance-this.amount;
				System.out.println("After Withdraw the balance is: "+this.balance);
				
			}else {
				name = Thread.currentThread().getName();
				System.err.println("Sorry!!! "+name+" balance is insufficient..");
			}
		}
}
public class BankApplication {
	public static void main(String[] args) {
		Customer1 cust = new Customer1(20000);
		Runnable r1 =()->cust.withdraw();
		Thread t1 = new Thread(r1,"Scott");
		Thread t2 = new Thread(r1,"Smith");
		
		t1.start();
		t2.start();
	}
}
