package com.lab.setter_getter;

public class EmployeeBonusTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeName("John Doe");
		employee.setBasicSalary(50000);
		employee.setPerformanceRating(2);

		employee.display();
		
		Bonus bonus = Bonus.calculateBonus(employee);
		System.out.println("Bonus Amount: "+bonus.getBonusAmount());
	}
}
