package com.multithreading;
class Foo extends Thread{
	public void run() {
		System.out.println("Child thred is running...");
		System.out.println("It is running with separate stack memory");
	}
}
public class IsAlive {
	public static void main(String[] args) {
		System.out.println("main thread started...");
		Foo f1 = new Foo();
		
		System.out.println("Is Thread alive : "+f1.isAlive());
		f1.start();
		System.out.println("Thread is alive or not : "+f1.isAlive());
		
		System.out.println("main thread ended...");
	}
}
