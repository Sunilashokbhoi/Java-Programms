package com.java.copy_constructore;

public class CopyConstructore {
	public static void main(String[] args) 
	{
		Employee emp = new Employee(101,"Scot");
		Manager m1 = new Manager(emp);
		System.out.println(m1);
	}

}
