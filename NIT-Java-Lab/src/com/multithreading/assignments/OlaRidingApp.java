package com.multithreading.assignments;
class RideRequest extends Thread{
	public void run() {
		System.out.println("User requested a ride...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Searching for nearby drivers...");
	}
}
class DriverAssignment extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Driver found and assigned!");	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
class FareCalculation extends Thread{
	public void run() {
		System.out.println("Calculating estimated fare...");
		try {
		Thread.sleep(1500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Estimated fare: 135.75 RS.");
	}
}
class LiveTracking extends Thread{
	public void run() {
		
		for(int i=20;i<=100;i+=20) {
			try {
			Thread.sleep(500);
			System.out.println("Updating ride location... "+i+"% completed");
		}catch( InterruptedException e){
			e.printStackTrace();
		}
		}
		System.out.println("Ride completed!");
	}
}
class PaymentProcessing extends Thread{
	public void run() {
		System.out.println("Processing payment...");
		try {
			Thread.sleep(2000);
			System.out.println("Payment successful!");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class RatingSystem extends Thread{
	public void run() {
		System.out.println("Requesting user rating...");
		try {
			Thread.sleep(1000);
			System.out.println("User rated the ride: 5 star");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class OlaRidingApp {
	public static void main(String[] args) throws InterruptedException {
		RideRequest rr = new RideRequest();
		DriverAssignment da = new DriverAssignment();
		FareCalculation  fc = new FareCalculation();
		LiveTracking lt = new LiveTracking();
		PaymentProcessing pp = new PaymentProcessing();
		RatingSystem rs = new RatingSystem();
		
		rr.start();
		fc.start();
		rr.join();
		da.start();
		da.join();
		lt.start();
		  lt.join();
		pp.start();pp.join();
		rs.start();
	}
}
