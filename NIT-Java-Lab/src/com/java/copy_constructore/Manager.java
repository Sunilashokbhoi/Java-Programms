package com.java.copy_constructore;

public class Manager 
	{
		private int managerId;
		private String managerName;

		public Manager(Employee emp) {
			super();
			this.managerId = emp.getEmployeeId();
			this.managerName = emp.getEmployeeName();
		}



		@Override
		public String toString() {
			return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
		}

	}