package com.multithreading.mt;
class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread is Running ");
	}
}
public class SleepDemo2 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Thread Started ");
		MyThread1 m1 = new MyThread1();
		m1.start();
		m1.sleep(50000);
		System.out.println("mainthread is Ended!!!");
	}

}
