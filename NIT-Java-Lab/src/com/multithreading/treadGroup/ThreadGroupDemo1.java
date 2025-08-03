package com.multithreading.treadGroup;
class Foo implements Runnable
{
	public void run() {
		for(int i=1;i<=10;i++)
		{
			String name = Thread.currentThread().getName();
			System.out.println(i+" by "+name+" Thread");
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
			//	e.printStackTrace();
			}
		}
	}
}
public class ThreadGroupDemo1 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Batch40");
		
		Thread t1 = new Thread(tg,new Foo(),"Scott");
		Thread t2 = new Thread(tg ,new Foo(),"Smith");
		Thread t3 = new Thread(tg ,new Foo(),"Alen");
		Thread t4 = new Thread(tg,new Foo(),"John");
		
		t1.start();t2.start();t3.start();t4.start();
		System.out.println("Group Name is :"+tg.getName());
		System.out.println("Total Number of active threads :"+tg.activeCount());
	}
}
