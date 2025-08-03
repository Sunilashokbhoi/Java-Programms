package com.multithreading.tasks;
class Account extends Thread
{
	private int balance = 0;
	public synchronized void withdraw(int amount) {
		while(this.balance > amount) {
			System.out.println("Withdrawing ...");
			this.balance = this.balance-amount;
			System.out.println("withdraw "+amount+" balance is "+balance);
			notifyAll();
		}
			try {
			System.out.println("waiting balance insufficient");
			wait();
			}catch(Exception e) {}
		
	}
 	public synchronized void deposit(int amount)
 	{ 
 		System.out.println("Going to deposit");
 		this.balance = this.balance + amount;
 		System.out.println("deposit amount is :"+amount);
 		System.out.println("updated balance is : "+balance);
 		notifyAll();
 	}
}
class Drawer extends Thread
{
	/**
	 * @param account
	 */
	protected Drawer(Account account) {
		super();
		this.account = account;
	}

	private final Account account;
	public void run() {
		System.out.println("Drawer ");
		int a[] = {1000,2000,3000};
		for(int i:a) {
			System.out.println(i);
			account.withdraw(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
			}
			}
		}
	}
class Depositor extends Thread{
	/**
	 * @param account
	 */
	protected Depositor(Account account) {
		super();
		this.account = account;
	}


	private final Account account;
	public void run(){
		int a2[] = {5000,3000,2000};
		for(int i:a2) {
			try {
			Thread.sleep(1000);
			System.out.println("depositing amount: ");
			account.deposit(i);
			
			}catch(Exception e) {}
		}
	}
}
public class ATMMachine {
	public static void main(String[] args) {
		Account account = new Account(); 
		Drawer dr = new Drawer(account);
		Depositor dp = new Depositor(account);
		dr.start();
		dp.start();
	}
}
