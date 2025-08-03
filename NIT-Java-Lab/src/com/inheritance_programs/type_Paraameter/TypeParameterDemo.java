package com.inheritance_programs.type_Paraameter;
class Box<T>
{
	private T data;
	public Box(T data)
	{
		super();
		this.data = data;
	}
	public T getData() {
		return data;
	}
}
public class TypeParameterDemo {
	public static void main(String[] args) {
		Box<Integer> intType = new Box<Integer>(12);
		System.out.println("Integer Type :"+intType.getData());
		
		Box<Double> doubleType = new Box<Double>(23.89);
		System.out.println("Double Type :"+doubleType.getData());
		
		Box<Boolean> booleanType = new Box<Boolean>(true);
		System.out.println("Boolean Type is "+booleanType.getData());
		
		Box<Student> studentType = new Box<Student>(new Student(12345));
		System.out.println("Syudent Type : "+studentType.getData());
	}
}
class Student{
	private int id ;
	public Student(int id) {
		super();
		this.id= id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}
