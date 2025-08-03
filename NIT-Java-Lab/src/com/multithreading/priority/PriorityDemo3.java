package com.multithreading.priority;
class Foo implements Runnable{
	public void run() {
		int counter = 0;
		for(int i=1;i<=1000000;i++)
		{
			counter++;
		}
		int priority = Thread.currentThread().getPriority();
		String name = Thread.currentThread().getName();
		
		System.out.println("Completed thread name is :"+name+" and its priority is :"+priority);
	}
}
public class PriorityDemo3 {
	public static void main(String[] args) {
		Foo f1 = new Foo();
		Thread t1 = new Thread(f1,"Last");
		Thread t2 = new Thread(f1,"First");
		
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}
