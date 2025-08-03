package com.multithreading.Example;

public class Test14 implements Runnable {
	public void run() {
		try {
			System.out.println("run");
			throw new RuntimeException("Problem");
		}catch(Exception e)
		{
			System.out.println("Handle");
		}
	}
	public static void main(String[] args) {
		Thread t = new Thread(new Test14());
		t.start();
		System.out.println("End of method.");
	}
}
