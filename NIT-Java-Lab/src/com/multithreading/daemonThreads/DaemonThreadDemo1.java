package com.multithreading.daemonThreads;
class FooThread extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("Is it Daemon thread :"+t.isDaemon());
	}
}
public class DaemonThreadDemo1 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Main Thread ");
		FooThread tf = new FooThread();
		tf.setDaemon(true);
		tf.start();
			Thread.sleep(2000);
	}
}
