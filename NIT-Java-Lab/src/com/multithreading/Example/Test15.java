package com.multithreading.Example;


public class Test15 {
	public static void main(String[] args) {
		myRunnable r = new myRunnable();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("Thread One");
		t2.setName("Thread Two");
		
		t1.start();
		t2.start();
		System.out.println("Main Thread:"+Thread.currentThread().getName());
	}
}
class myRunnable implements Runnable {
	public void run() {
		for(int i = 1;i<4;i++) 
			System.out.println("Thread:"+Thread.currentThread().getName());
	}
}