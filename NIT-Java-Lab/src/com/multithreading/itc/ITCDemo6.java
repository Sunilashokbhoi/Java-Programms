package com.multithreading.itc;

import com.has_a_relation.copy.Trainer;

class Resource
{
	private boolean flag = false;
	public synchronized void waitMethod()
	{
		System.out.println("wait");
		while(!flag)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+" is waiting for notification ");
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"thread complete !!");
	}
	public synchronized void setMthod()
	{
		System.out.println("notifiyAll");
		this.flag = true;
		System.out.println(Thread.currentThread().getName()+" has make flag value as a true " );
		notifyAll();
	}
}
public class ITCDemo6 {
	public static void main(String[] args) {
		Resource r1 = new Resource();
		Thread t1 = new Thread(()->r1.waitMethod(),"Child1");
		Thread t2 = new Thread(()-> r1.waitMethod(),"Child2");
		Thread t3 = new Thread(()->r1.waitMethod(),"Child3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
