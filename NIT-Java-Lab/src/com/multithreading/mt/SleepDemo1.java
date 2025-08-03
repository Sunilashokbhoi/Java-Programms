package com.multithreading.mt;
class MyTest extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread id is :"+Thread.currentThread().getId());
		for(int i=1;i<=5;i++) {
			System.out.println("i value is "+i);
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class SleepDemo1 {
	public static void main(String[] args) {
		System.out.println("Main Thread id is :"+Thread.currentThread().getId());
		MyTest m1 = new MyTest();
		MyTest m2 = new MyTest();
		
		m1.start();
		m2.start();
		
		
	}
}
