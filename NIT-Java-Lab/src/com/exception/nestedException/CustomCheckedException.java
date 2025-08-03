package com.exception.nestedException;
@SuppressWarnings("serial")
 class InvalidAgeException  extends Exception{
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}

public class CustomCheckedException{
	public static void main(String[] args) {
		try {
			validateAge(17);
		}
		catch(InvalidAgeException e) {
			System.err.println(e);
		}
	}

	public static void validateAge(int age)throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age is invalid");
		}
		else {
			System.out.println("Your are eligible for vote because ypur age is :"+age);
		}
		
	}
}