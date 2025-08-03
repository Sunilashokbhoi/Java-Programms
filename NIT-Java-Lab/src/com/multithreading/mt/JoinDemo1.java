package com.multithreading.mt;

public class JoinDemo1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Thread started");
		
		Thread t = Thread.currentThread();
		
		for(int i=1;i<=10;i++) {
			System.out.println("I value is :"+i+ " by "+t.getName());
			Thread.sleep(1000);
		}
		//t.join();
		System.out.println("Main Thread complated");
	}
}
