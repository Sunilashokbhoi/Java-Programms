package com.multithreading.mt;

public class MainThread {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println("Current Thread Name is :"+t1.getName());
		String name = Thread.currentThread().getName();
		//OR
		System.out.println("Running thread name is "+name);
	}
}
