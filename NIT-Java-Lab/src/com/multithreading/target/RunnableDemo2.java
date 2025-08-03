package com.multithreading.target;
class Tatkal implements Runnable{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name +" has booked the ticket under Tatkal Scheme");
	}
}
class PremiumTatkal implements Runnable{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name +" has booked the ticket under PremimTatkal schemes");
	}
}

public class RunnableDemo2 {
		public static void main(String[] args) {
			Thread scott = new Thread(new Tatkal(),"Mr.Scott");
			
			Thread smith = new Thread(new PremiumTatkal(),"Mr.Smith");
			
			scott.start();
			smith.start();
		}
}
