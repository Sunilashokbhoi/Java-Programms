package com.multithreading.daemonThreads;

public class InterruptedThread2 {
	public static void main(String[] args) {
	Thread thread = new Thread(new MyRunnable());
	thread.start();
	try
	{
		Thread.sleep(3000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	thread.interrupt();
	}
}
class MyRunnable implements Runnable
{
	public void run() {
		try
		{
			while(!Thread.currentThread().isInterrupted())
			{
				System.out.println("Thread is running by locking the resource");
					Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Thread interupted gracefully.");
		}
		finally 
		{
			System.out.println("Thread resource can be release here.");
		}
	}
}
