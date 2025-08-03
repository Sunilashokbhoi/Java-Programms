package com.java.staticBlockDemo;
class Demo9{
	 public static final Demo9 d9 = new Demo9();
	 static {
		 System.out.println("Static Block..");
	 }
	 {
		 System.out.println("Non Static Block..");
	 }
	 Demo9(){
		 System.out.println("No argument constructor");
	 }
}
public class StaticBlockDemo9 {
	public static void main(String[] args) {
		new Demo9();   //2 steps (class loading + Object creation)
	}
}
