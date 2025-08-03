package com.exception.basic;

public class MultipleTryCatch {
	public static void main(String[] args) {
		System.out.println("Main method stated!!!!!!!!!");
	    try {
	    	int arr[] = { 10,20,30};
	    	System.out.println(arr[3]);
	    	
	    }catch(ArrayIndexOutOfBoundsException e){
	    	System.err.println("Array index is out of limit ");
	    	
	    }try {
	    	String str=null;
	    	System.out.println(str.length());
	    }
	    catch(NullPointerException e) {
	    	System.err.println("ref variable is pointing to null ");
	    }try {
	    	int ans = 10/0;
	    	System.out.println(ans);
	    }catch(Exception e) {
	    	System.err.println(e);
	    }
	    System.out.println("main method ended  ");
	    

	}
}
