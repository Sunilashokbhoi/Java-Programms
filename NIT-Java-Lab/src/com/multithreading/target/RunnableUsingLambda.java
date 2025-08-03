package com.multithreading.target;

public class RunnableUsingLambda {
	public static void main(String[] args) {
		Runnable r1 =()->
		{
			String name = Thread.currentThread().getName();
			System.out.println("Running Thread is :"+name);
		};
		Thread t1= new Thread(r1);
		t1.start();
	Runnable r2 =()->{
		String name1 = Thread.currentThread().getName();
		System.out.println("Running Thread 1 is "+name1);
	};
	Thread t2 = new Thread(r2);
	t2.start();
	}
}
