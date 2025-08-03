package com.multithreading;
class Demo1 extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("run "+name);
	}
}
public class Demo {
	public static void main(String[] args) {
		System.out.println("Main Started..");
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		d1.start();
		d2.start();
		Demo1 d = new Demo1();
		System.out.println("M "+d.getName());
		System.out.println("Main :"+d2.currentThread().getName());
		d2.currentThread().getName();
	}
}
