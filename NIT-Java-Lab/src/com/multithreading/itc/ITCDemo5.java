package com.multithreading.itc;
class TicketSystem
{
	private int availableTickets = 5;
	public synchronized void bookTicket (int numberOfTickets)
	{
		while (availableTickets < numberOfTickets)
		{
			System.out.println("Not enough tickets available , Waiting for cancellation..");
			try {
				wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableTickets = availableTickets - numberOfTickets;
		System.out.println("Booked "+ numberOfTickets+" ticket(s).Remaining tickets: "+availableTickets);
		notify();
	}
	public synchronized void cancelTicket(int numberOfTickets)
	{
		availableTickets = availableTickets-numberOfTickets;
		System.out.println("Calceled "+ numberOfTickets +"ticket(s).Asvailable tickets: "+availableTickets);
		notify();
	}
}
public class ITCDemo5 {
	public static void main(String[] args) {
		TicketSystem ticketSystem = new TicketSystem();
		Thread bookingThread = new Thread()
		{
			public void run() {
				int[] ticketsToBook = {2,2,3};
				for(int ticket : ticketsToBook)
				{
					ticketSystem.bookTicket(ticket);
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		bookingThread.start();
		
		Thread canellationThread = new Thread()
		{
			public void run() {
				int[] ticketToCancel = {1,3,2};
				for(int ticket : ticketToCancel)
				{
					ticketSystem.cancelTicket(ticket);
					try
					{
						Thread.sleep(1500);
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		};
		canellationThread.start();
	}
}
