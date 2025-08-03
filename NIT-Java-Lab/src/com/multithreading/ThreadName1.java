package com.multithreading;
class Demo2 extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is :"+name);
	}
}
public class ThreadName1 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("Parent");
		
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2();
		
		d1.setName("Child1");
		d2.setName("Child2");
		d1.start();
		d2.start();
		String name = Thread.currentThread().getName();
		System.out.println(name +" Thread is running here ..");
	}
}
