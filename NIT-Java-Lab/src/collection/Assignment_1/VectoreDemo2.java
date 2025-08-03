package collection.Assignment_1;

import java.util.Vector;

public class VectoreDemo2 {
	public static void main(String[] args) {
		Vector obj = new Vector(4,2);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		obj.addElement(new Integer(4));
		//obj.addElement(new Integer(23));
		System.out.println(obj.capacity());
		
	}
}
