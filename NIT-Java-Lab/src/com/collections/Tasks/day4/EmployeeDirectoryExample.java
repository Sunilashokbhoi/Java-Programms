package com.collections.Tasks.day4;

public class EmployeeDirectoryExample {
	public static void main(String[] args) {
		Directory directory = new Directory();
		
		//Adding employee
		Employee alice = new Employee("Alice", "Manager", 60000);
		Employee bob = new Employee("Bob", "Developer", 50000);
		directory.addEmployee(alice);
		directory.addEmployee(bob);
		
		System.out.println("Initial diaplay :");
		directory.displayAllEmployees();
		
		Employee updatedBob = new Employee("Bob","Senior developer",55000);
		directory.updateEmployee(1, updatedBob);
		
		System.out.println("\n Display after updating bob's information ");
		directory.deleteEmployee(0);
		
		System.out.println("\nFinall display after deleting alice");
		directory.displayAllEmployees();
	}
	
}
