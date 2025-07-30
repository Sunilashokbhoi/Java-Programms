import java.util.*;
public class SortedMapMethod {
public static void main(String[] args) {
    SortedMap<Integer,String> map = new TreeMap<>();
    map.put(100,"Amit");
    map.put(101,"Ravi");
    map.put(102,"Vijay");
    map.put(103,"Rahul");
    System.out.println("First Key "+map.firstKey());
    System.out.println("Last key "+map.lastKey());
    System.out.println("Head Key "+map.headMap(102) );
    System.out.println("Tail key "+map.tailMap(102));
    System.out.println("Sub map "+map.subMap(101, 103));
}
    
}