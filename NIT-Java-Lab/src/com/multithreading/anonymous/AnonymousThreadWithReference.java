package com.multithreading.anonymous;

public class AnonymousThreadWithReference {
	public static void main(String[] args) {
		//Anonymouse inner class
		Thread t1 = new Thread() {
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("Running Thread name is :"+name);
			}
		};
		t1.start();
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread name is :"+name);
	}
}
