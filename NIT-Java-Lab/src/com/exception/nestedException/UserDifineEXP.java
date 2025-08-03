package com.exception.nestedException;
class AgeCheckException extends Exception{
	public AgeCheckException() {
		
	}
	public AgeCheckException(String error) {
		super(error);
	}
}

public class UserDifineEXP {
	public static void validate(int age) throws AgeCheckException{
		if(age<18) {
			throw new AgeCheckException("Age is not valid");
		}else {
			System.out.println("Age is validate ");
		}
	}public static void main(String[] args) {
		try {
			validate(13);
		}
		catch (AgeCheckException e) {
			System.out.println("catch the exception");
		}
	}
}
