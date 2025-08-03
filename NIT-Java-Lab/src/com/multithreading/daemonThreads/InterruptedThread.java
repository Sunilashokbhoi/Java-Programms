package com.multithreading.daemonThreads;
class Interrupt extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Is thread interrupted :"+t.interrupted());
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.err.println(e);
		}
	}
}
public class InterruptedThread {
	public static void main(String[] args) {
		Interrupt it = new Interrupt();
			System.out.println("Thread State is "+it.getState());
			it.start();
			it.interrupt();
	}
}
