package com.collections.Tasks.day4;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

public class Directory {
	private List<Employee> employees;
	public Directory()
	{
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	public void displayAllEmployees() {
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}
	public void updateEmployee(int index,Employee employee) {
		if(index>=0 && index < employees.size()) {
			Employee newEmployee = null;
			employees.set(index, newEmployee);
		}else {
			System.out.println("Invalid index");
		}
		}
	public void deleteEmployee(int index) {
		if(index>=0&& index < employees.size()){
			employees.remove(index);
		}
		else {
			System.out.println("onvalid index");
		}
	}
		
	}
