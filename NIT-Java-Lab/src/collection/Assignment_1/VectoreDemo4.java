/*Que-3)
------------------
What will be the output of the following Java code?
 import java.util.*;
a)0
b)1
c)true
d) false
*/

package collection.Assignment_1;
import java.util.Vector;
public class VectoreDemo4 {
	public static void main(String[] args) {
		Vector obj = new Vector(4,2);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		obj.removeAll(obj);
		System.out.println(obj.isEmpty());
	}
}
