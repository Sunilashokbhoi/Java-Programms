package com.interface_Demo.Record.Interface;

public record ProductRecord(int productId,String producName) {
	
	//Compact Constructor
	public ProductRecord {
		if(productId<=0) {
			System.err.println("Id invalid");
		}
	}
}
