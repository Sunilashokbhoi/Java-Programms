package com.java.InstanceVariableInitializationOrder;
class Student{
	final String name ;
	public Student() {
		name = "Scott";
	}
	public Student(String name ) {
		this.name = name;
	}
}
public class BlankFinalFieldDemo5 {

	public static void main(String[] args) {
		Student scott = new Student();
		System.out.println(scott.name);
		
		Student smith =  new Student();
		System.out.println(smith.name);
	}

}
//blank final field must be initialized in all the constructor available in the class.
