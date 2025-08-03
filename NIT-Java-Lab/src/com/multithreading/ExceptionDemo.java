package com.multithreading;

class Stuff extends Thread
{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Chind Thread is Running, name is : "+name);
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println(name +" thread started");
		
		Stuff s1 = new Stuff();
		Stuff s2 = new Stuff();
		
		s1.start();
		s2.start();
		
		System.out.println(10/0);
		System.out.println("Main Thread Ended ");
	}
}
