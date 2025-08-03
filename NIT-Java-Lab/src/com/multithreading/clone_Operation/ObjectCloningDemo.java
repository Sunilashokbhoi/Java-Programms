package com.multithreading.clone_Operation;
class Customer implements Cloneable{
	private Integer customerId;
	private String customerName;
	public Customer(Integer customerId ,String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class ObjectCloningDemo {
	public static void main(String[] args) {
		
		try
		{
			Customer c1 = new Customer(111, "Scott");
			Customer c2 = (Customer) c1.clone();
			
			System.out.println("Before Modification ");
			System.out.println(c1);
			System.out.println(c2);
			
			System.out.println("After Modification ");
			c2.setCustomerId(222);
			c2.setCustomerName("Smith");
			System.out.println(c1);
			System.out.println(c2);
		}
			catch(CloneNotSupportedException e) {
				System.out.println("JVM does not have any information ");
				e.printStackTrace();
			}
	}
}
