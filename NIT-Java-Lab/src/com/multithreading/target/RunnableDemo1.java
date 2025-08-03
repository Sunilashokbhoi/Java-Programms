package com.multithreading.target;
class UserThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Child Thread is Running ");
		System.out.println("It is running in a separate Stack");
	}
}
public class RunnableDemo1 {
	public static void main(String[] args) {
		System.out.println("Main Thread Started..");
		UserThread ut = new UserThread();
		Thread t1 = new Thread(ut);
		t1.start();
		Thread t2 = new Thread(ut);
		t2.start();
	}
}
