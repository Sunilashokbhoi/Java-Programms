package com.java.memory_management;

class Customer {
	
	 String names ;
	private int id;
	
	public Customer(String names, int id) {
		super();
		this.names = names;
		this.id = id;
	}

	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}	

}