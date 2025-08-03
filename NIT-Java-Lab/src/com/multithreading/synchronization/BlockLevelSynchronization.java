package com.multithreading.synchronization;
class ThreadName{
	public void printThradName() {
		String name = Thread.currentThread().getName();
		System.out.println("Thread inside the method is :"+name);
		synchronized (this) {
			System.out.println(name+" thread has entered inside Syn Block ");
			for(int i=1; i<= 10; i++)
			{
				System.out.println(i+" by "+name+" thread");
				try
				{
					Thread.sleep(500);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name+" thread has completed syn Block");
		}
	}
}
public class BlockLevelSynchronization {
	public static void main(String[] args) {
		ThreadName tn= new ThreadName();
		
		Runnable r1 = ()-> tn.printThradName();
		Thread t1 = new Thread(r1,"Child1");
		Thread t2 = new Thread(r1,"Child2");
		
		t1.start(); t2.start();
	}
}
