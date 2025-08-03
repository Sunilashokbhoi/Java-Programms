package com.multithreading.target;

public class AnonymousInnerWithRunnable {
	public static void main(String[] args) {
		Runnable r1 = new Runnable () {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("Running thread is "+name);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

	}
}
