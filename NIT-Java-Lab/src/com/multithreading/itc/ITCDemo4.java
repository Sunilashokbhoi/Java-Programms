package com.multithreading.itc;

import java.nio.file.attribute.AclFileAttributeView;

class Customer
{
	private double balance = 10000;
	
	public synchronized void withdraw(double amount) 
	{
		System.out.println("Going for withdraw..");
		if(amount > this.balance)
		{
			System.err.println("Low Balance, Waiting for deposit");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Got notification, Going to withdraw");
		}
		this.balance = this.balance - amount;
		System.out.println("Reamining Balance after withdraw is :"+this.balance);
	}
	
	public synchronized void deposit(double amount)
	{
		System.out.println("Going to deposit");
		this.balance = this.balance + amount;
		System.out.println("Balance After deposit is :"+this.balance);
		notify();
	}	
}

public class ITCDemo4 
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		
		Thread son = new Thread()
	    {
		   @Override
		   public void run()
		   {
			   c1.withdraw(15000);
		   }
	    };
		
	    son.start();
	    
	    Thread father = new Thread()
	    {
		   @Override
		   public void run()
		   {
			   c1.deposit(10000);
		   }
	    };
		
	      father.start();
 	}

}