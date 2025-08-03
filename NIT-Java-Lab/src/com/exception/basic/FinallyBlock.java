package com.exception.basic;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Main method started ");
		try {
			System.out.println(10/0);
		}finally
		{
			System.out.println("finally Block");
		}
		System.out.println("Main method ended");
	}
	
}
