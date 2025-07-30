import java.util.*;
public class NavigableSetDemo
{
public static void main(String[] args)
{
NavigableSet<Integer> ns = new TreeSet<>();
ns.add(1);
ns.add(2);
ns.add(3);
ns.add(4);
ns.add(5);
ns.add(6);
System.out.println("lower(3) "+ns.lower(3));
System.out.println("Floor(3)"+ns.floor(3));
System.out.println("Higher(3)"+ns.higher(3));
System.out.println("Ceiling(3) "+ns.ceiling(3));
}
}