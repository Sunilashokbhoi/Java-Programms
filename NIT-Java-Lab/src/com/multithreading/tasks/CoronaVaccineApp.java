package com.multithreading.tasks;

class VaccineEligibility{
	/**
	 * @param age
	 * @param hasHealthCondition
	 */
	protected VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	private int age ;
	private boolean hasHealthCondition;
	
	public boolean isEligible() {
		return (age>=18)&&(age<60 || hasHealthCondition);
	}
}
class DoseBooking {
	private boolean booked =false;
	
	public synchronized void bookDose() {
		if(booked) {
			throw new RuntimeException("Dose already booked..");
		}
		booked = true;
	}
	public boolean isDoseBooked() {
		return booked;
	}
}
class User{
	/**
	 * @param name
	 */
	protected User(String name,int age,boolean helthcond) {
		super();
		this.setName(name);
		this.vaccineEligibility = new VaccineEligibility(age, helthcond);
		this.doseBooking = new DoseBooking();
		
	}
	private String name;
	private VaccineEligibility vaccineEligibility;
	private DoseBooking doseBooking ;
	
	public boolean isEligible() {
		return vaccineEligibility.isEligible();
	}
	public void bookDose() {
		if(!isEligible()) {
			throw new RuntimeException("You are not eligible for the vaccine.");
		}
		doseBooking.bookDose();
	}
	public boolean isDoseBooked(){
		return doseBooking.isDoseBooked();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class CoronaVaccineApp {
	public static void main(String[] args) {
		User u1 = new User("john",45, false);
		User u2 = new User("Jane",70,true);
		
		Thread t1 = new Thread(()->{
			try {
				if(u1.isEligible()) {
					u1.bookDose();
					System.out.println(u1.getName()+" booked the dose successfully..");
				}
			}catch(RuntimeException e) {
				System.out.println(u1.getName() +" : "+e.getMessage());
				
			}
		});
		Thread t2 = new Thread(()->{
			try {
			if(u2.isEligible()) {
				u2.bookDose();
				System.out.println(u2.getName() +" booked the dose successfully..");
			}
			}catch(RuntimeException e) {
				System.out.println(u2.getName() +" : "+e.getMessage());
			}
		});
		t1.start();
		t2.start();
	}
}
