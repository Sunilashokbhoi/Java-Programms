package com.multithreading.deadlocks;
class ShareData
{
	private volatile boolean flag = false;
	public void startThread()
	{
		Thread writen = new Thread(()->
		{
			try
			{
				Thread.sleep(1000); //writen thread will go for 1 sec waiting state 
				flag = true;
				System.out.println("Writer thread make the flag value as true");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread reader = new Thread(()->
		{
			while(!flag) //Catch memory still the value of flag is false
			{
				
			}
			System.out.println("Reader thread got the updated values");
		});
		writen.start();
		reader.start();
	}
}
public class VolatileExample {
	public static void main(String[] args) {
		new ShareData().startThread();
	}
}
