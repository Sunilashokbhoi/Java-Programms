package com.interface_Demo.InterfaceMember;
interface Printable{
	//public String toString();//added by compiler
	//public int hashCode(); //add by compiler
	//public boolean equals(Object obj); //added by compiler
}
class Print extends Object implements Printable{
//	public String toString(){
//		return "toString";
//	}
//	public int hashCode() {
//		System.out.println("Int");
//		return 120;
//	}
//	public boolean equals(Object obj) {
//		return true;
//	}
}
public class InterfaceMemberDemo1 {
	public static void main(String[] args) {
		Printable p = new Print();
		p.toString();
		p.hashCode();
		p.equals(null);
	}
}
