package com.Overriding.Seald_Class;
sealed class OnlineClass permits Laptop,Mobile,Tv{
	public void attendJavaOnline() {
		System.out.println("Sunday Online class at 9:30 am");
	}
}
final class Laptop extends OnlineClass{
	public void attendJavaOnline() {
		System.out.println("Attending Class On Through Laptop");
	}
}
final class Mobile extends OnlineClass{
	public void attendJavaOnline(){
		System.out.println("Attending Online Class Through Mobile");
	}
}
final class Tv extends OnlineClass{
	public void attendJavaOnline() {
		System.out.println("Attending Online Class Through Tv");
	}
}
public class SealedDemo2 {
	public static void main(String[] args) {
		OnlineClass oc = null;
		oc = new Laptop();
		oc.attendJavaOnline();
		oc = new Mobile();
		oc.attendJavaOnline();
		oc = new Tv();
		oc.attendJavaOnline();
	}
	
}
