package com.interface_Demo.consumer_Function;

public class ConsumerDemo1 {
	public static void main(String[] args) {
		Consumer<Integer> c1 = num ->
		System.out.println(num);
		c1.accept(12);
		
		Consumer<String> c2 = str ->
		System.out.println(str);
		c2.accept("Java");
		
		Consumer<Employee> c3 = emp ->
		System.out.println(emp);
		c3.accept(new Employee(123,"Scott"));
	}
	
}
class Employee{
	/**
	 * @param empId
	 * @param empName
	 */
	protected Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	private int empId ;
	private String empName;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}