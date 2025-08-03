package com.multithreading.deadlocks;

public class DeadlockExample {
	public static void main(String[] args) {
		String resource1 = new String("Ameerpet");   //L1  
		String resource2 = new String("S R Nagar");  //L2
		
	//t1 tries to lock resource(L1) then resource2(L2) 
	Thread t1 = new Thread()
			{
				public void run()
				{
					synchronized (resource1) {
					System.out.println("Thread 1 : locked resoutce 1");	
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
					}
					synchronized (resource2) {
					System.out.println("Thread 1 : locked resource 2");
					}
					}
				}
			};
	        //t2 tries to lock resource 2 then resource1
	Thread t2 = new Thread()
			{
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread2 :locked rersource 2");
					     try
					     {
					    	 Thread.sleep(1000);
					     }
					     catch(InterruptedException e)
					     {
					     }
		   //t2 thread will wait for L1 (Resource 1)
				synchronized (resource1) {
					System.out.println("Thread 2: locked resource 1");
				}	     
				}
			}
			};
			t1.start();
			t2.start();
	}
}
