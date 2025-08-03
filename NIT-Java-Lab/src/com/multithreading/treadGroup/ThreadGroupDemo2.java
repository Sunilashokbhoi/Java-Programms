package com.multithreading.treadGroup;
class Tatkal implements Runnable{
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" has booked the ticket under Tatkal Scheme");
	}
}
class PremimunTatkal implements Runnable
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" has booked the ticket under PrminumaTatkal Scheme");
	}
}
public class ThreadGroupDemo2 {
	public static void main(String[] args) {
		ThreadGroup tatkal = new ThreadGroup("Tatkal");
		ThreadGroup premimumTatkal = new ThreadGroup("Premimum_Tatkal");
		
		Thread t1 = new Thread(tatkal,new Tatkal(),"Scott");
		Thread t2 = new Thread(premimumTatkal,new PremimunTatkal(),"Raj");
		t1.start();
		t2.start();
	}
}
