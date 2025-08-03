package com.multithreading.priority;

public class PriorityDemo1 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println("Default Priority is :"+t1.getPriority());
	}
}
