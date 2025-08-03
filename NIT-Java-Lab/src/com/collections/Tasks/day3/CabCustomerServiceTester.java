package com.collections.Tasks.day3;

import java.util.ArrayList;
import java.util.Optional;

class CabCustomer{
	private int custId ;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private String phone;
	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
			String phone) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}
	/**
	 * 
	 */
	public CabCustomer() {
		super();
	}
	protected int getCustId() {
		return custId;
	}
	protected void setCustId(int custId) {
		this.custId = custId;
	}
	protected String getCustomerName() {
		return customerName;
	}
	protected void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	protected String getPickupLocation() {
		return pickupLocation;
	}
	protected void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	protected String getDropLocation() {
		return dropLocation;
	}
	protected void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	protected int getDistance() {
		return distance;
	}
	protected void setDistance(int distance) {
		this.distance = distance;
	}
	protected String getPhone() {
		return phone;
	}
	protected void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
class CabCustomerService{
	//CabCustomer cabCustomer = new CabCustomer();

	
	private ArrayList<CabCustomer> customers = new ArrayList<CabCustomer>();
	public void addCabCustomer(CabCustomer cabCustomer) {
	customers.add(cabCustomer);
	}
	public boolean isFirstCustomer(CabCustomer cast) {
		for(CabCustomer oldCust : customers) {
			
			if(oldCust.getPhone().equals(cast.getPhone())) {
				return false;
			}
		}
		return true;
	}
	public int calculateBill(CabCustomer cust) {
		if(isFirstCustomer(cust)) {
			return 0;
		}
		else if(cust.getDistance()<=4) {
			return  80;
		}
		else {
			return 80+6*(cust.getDistance()-4); 
		}
	}
	public void printBill(CabCustomer customer) {
		double bill = calculateBill(customer);
		System.out.println(customer.getCustomerName()+" Please pay your bill of Rs. "+ bill);
	}

}

public class CabCustomerServiceTester {
	public static void main(String[] args) {
		CabCustomerService service = new CabCustomerService();
		CabCustomer c1 = new CabCustomer(1, "sunil","Roadno5","Ameerpet", 7, "9075814200");
		CabCustomer c2 = new CabCustomer(2, "Lalit","Ameerpet","jubleeHill", 15, "9075814200");

		service.addCabCustomer(c1);
		service.printBill(c1);

		service.addCabCustomer(c2);
		service.printBill(c2);
	}	
}
