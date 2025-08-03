package com.has_a_relation;

public class AssociationDemo {
	public static void main(String[] args) {
		Student raj = new Student(111,"sunil",455);
		Student priya = new Student(222,"Priya",460);
		
		Trainer.viewStudentProfile(raj);
		Trainer.viewStudentProfile(priya);
	}
}
