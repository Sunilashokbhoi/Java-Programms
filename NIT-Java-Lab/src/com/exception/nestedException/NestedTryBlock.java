package com.exception.nestedException;

public class NestedTryBlock {
	public static void main(String[] args) {
		try {
			String x = "Sunil";
			System.out.println("It's length is : "+x.length());
			
			try {
				String y = "NIT";
				int z = Integer.parseInt(y);
				System.out.println("z values is :"+z);
			}catch (NumberFormatException e) {
				System.err.println("Number is not in a proper format");
			}
		}catch (NullPointerException e) {
			System.err.println("Null pointer Problem");
		}
	}
}
