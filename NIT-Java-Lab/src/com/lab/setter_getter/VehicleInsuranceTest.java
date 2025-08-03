package com.lab.setter_getter;

class Vehicle{
	private String vehicleType;
	private int vehicleAge;
	int premiumumAmount=0;
	
	
	public Vehicle(String vehicleType, int vehicleAge) {
		super();
		this.vehicleType = vehicleType;
		this.vehicleAge = vehicleAge;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleAge(int vehicleAge) {
		this.vehicleAge = vehicleAge;
	}
	
	public int getVehicleAge() {
		return vehicleAge;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle Types "+vehicleType);
		System.out.println("Vehicle Age "+vehicleAge);
	}
}

class InsurancePremium{
	private int premiumumAmount;
	
	public int getPremiumAmount() {
		return premiumumAmount;
	}
	
    public  static InsurancePremium calculatePremium(Vehicle vehicle) {
	 String vType = vehicle.getVehicleType();
	 int age = vehicle.getVehicleAge();
	   
	 InsurancePremium ip = new InsurancePremium();
	 if(vType.equalsIgnoreCase("car")) {
		 if(age<5)
			 ip.premiumumAmount = 5;
		 else if(age >= 5 && age < 10)
			 ip.premiumumAmount = 7;
		 else {
			 ip.premiumumAmount=10;
		 }
	 }else if(vType.equalsIgnoreCase("Truck")) {
		 if(age < 5) {
			 ip.premiumumAmount = 6;
		 }else if(age >= 5 && age <=10) {
			 ip.premiumumAmount = 8;
		 }else {
			 ip.premiumumAmount = 12;
		 }
	 }
    
	 return ip;
}
}


public class VehicleInsuranceTest {
	public static void main(String[] args) {
		Vehicle v = new Vehicle("car",6);
		v.displayDetails();
		 InsurancePremium obj =  InsurancePremium.calculatePremium(v);
		 System.out.println("Premium "+obj.getPremiumAmount()+"% of vehicle value");
	}
}
