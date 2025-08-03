package com.interface_Demo.Functional.Interface;

import java.util.Objects;

class Employee{
	/**
	 * @param employeeId
	 * @param employeeName
	 */
	protected Employee(Integer employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	private Integer employeeId;
	private String employeeName;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	protected Integer getEmployeeId() {
		return employeeId;
	}
	protected void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	protected String getEmployeeName() {
		return employeeName;
	}
	protected void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName);
	}
	
}
public class SupplierDemo2 {
	public static void main(String[] args) {
		Supplier<Employee> s2 = ()->
		{
			Employee e1 = new Employee(111,"Scott");
			return e1;
		};
		System.out.println(s2.get());
	}
}
