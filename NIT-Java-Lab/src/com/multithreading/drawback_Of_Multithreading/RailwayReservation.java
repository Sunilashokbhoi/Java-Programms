package com.multithreading.drawback_Of_Multithreading;
class Customer implements Runnable{
	
	private int availableSeat = 1;
	private int wantedSeat;
	
	protected Customer(int wantedSeat) {
		super();
		this.wantedSeat = wantedSeat;
	}

	@Override
	public void run() {
		String name = null;
		if(availableSeat >= wantedSeat) {
			name = Thread.currentThread().getName();
			System.out.println(wantedSeat+" seat is reserved for :"+name);
			availableSeat = availableSeat - wantedSeat;
			System.out.println("Seat is available : "+availableSeat);
		}
		else {
			name = Thread.currentThread().getName();
			System.err.println("Sorry!!!"+name+"seat is not available");
		}
	}
}
public class RailwayReservation {
	public static void main(String[] args) throws InterruptedException {
		Customer cust = new Customer(1);
		Thread t1 = new Thread(cust,"Scott");
		Thread t2 = new Thread(cust,"Smith");
		t1.start();
		t2.start();
	}
}
