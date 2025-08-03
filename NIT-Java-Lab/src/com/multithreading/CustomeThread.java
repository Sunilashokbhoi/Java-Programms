package com.multithreading;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Child thread is Running..");
	}
}

public class CustomeThread {
	public static void main(String[] args)throws InterruptedException {
		
		System.out.println("Main thread started ...");
		MyThread mt = new MyThread();
		mt.start();
	//	mt.run();
		System.out.println("Main thread ended...");
	
	}
}
