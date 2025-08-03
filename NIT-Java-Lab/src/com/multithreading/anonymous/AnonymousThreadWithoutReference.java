package com.multithreading.anonymous;

public class AnonymousThreadWithoutReference {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("Running Thread is :"+name);
			}
		}.start();
		System.out.println("Main thread is :"+Thread.currentThread().getName());
	}
}
