package com.multithreading.yield;

class Test implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println("I value is :" + i + " by " + name);
			if (name.equals("Child1")) {
				System.out.print("Yield Method : ");
				Thread.yield();
			}
		}
	}
}

public class YieldDemoExample {
	public static void main(String[] args) {
		Test test = new Test();
		Thread t1 = new Thread(test,"Child1");
		Thread t2 = new Thread(test,"Child2");
		 t1.start();
		 t2.start();
	}
}
