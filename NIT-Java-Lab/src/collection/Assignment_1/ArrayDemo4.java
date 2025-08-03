package collection.Assignment_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo4 {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Orange");
	list.add("Banana");
	
	ArrayList<String>  aelist = new ArrayList<>();
	aelist.add("Apple");
	aelist.add("Grapes");
	list.addAll(3,aelist);
	System.out.println(list);
}
}
