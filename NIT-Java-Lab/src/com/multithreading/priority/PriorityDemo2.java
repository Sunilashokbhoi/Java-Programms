package com.multithreading.priority;
class Priority extends Thread{
	public void run() {
		int priority = Thread.currentThread().MIN_PRIORITY;
		System.out.println("Child Thread Priority is :"+priority);
	}
}
public class PriorityDemo2 {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Main Thread Priority is :"+t.MAX_PRIORITY);
		new Priority().start();
	}
}
