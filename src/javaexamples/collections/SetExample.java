package javaexamples.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
//		Set<Integer> set = new HashSet<Integer>();
//		Set<Integer> set = new LinkedHashSet<>(); // order of insertion is maintained
//		Set<Integer> set = new TreeSet<>(); // elements are in sorted form
//		
//		set.add(23);
//		set.add(12);
//		set.add(54);
//		
//		System.out.println("Set: " + set);
//		
//		set.remove(54);
//		
//		System.out.println("Set: " + set);
//		
//		System.out.println(set.contains(100));
//		
//		set.clear();
//		
//		System.out.println(set.isEmpty());
//		
//		System.out.println(set.size());
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("Parth", 2));
		set.add(new Student("suhel", 3));
		set.add(new Student("Aman", 4));
		set.add(new Student("Ashutosh", 5));
		set.add(new Student("aman2", 6));
		
		System.out.println(set);
	}
}
