package com.multithreading.itc;
class Demo extends Thread{
	private int val=0;
	public void run() {
		synchronized (this) {
			System.out.println("Child Thread got the lock");
			for(int i=1;i<=100;i++) {
				this.val=this.val+i;
			}
			System.out.println("Sending Notification..");
			notify();
		}
	}
	public int getVal() {
		return this.val;
	}
}
public class ITCDemo3 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Started...");
		Demo d1 = new Demo();
		d1.start();
		 synchronized (d1) {
			System.out.println("Main Thread is waiting and lock is released ..");
			d1.wait();
			System.out.println("Main Thread got notification ");
			System.out.println(d1.getVal());
		}
	}
}
