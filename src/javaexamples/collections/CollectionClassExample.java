package javaexamples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassExample {
	
	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
//		list.add(34);
//		list.add(12);
//		list.add(9);
//		list.add(9);
//		list.add(9);
//		list.add(10);
//		list.add(11);
//		list.add(12);
//		list.add(12);
//		list.add(13);
//		list.add(14);
//		
//		System.out.println("min element:  " + Collections.min(list));
//		System.out.println("max element:  " + Collections.max(list));
//		System.out.println(Collections.frequency(list, 9));
//		
//		Collections.sort(list, Comparator.reverseOrder());
//		
//		System.out.println(list);
		
		List<Student> list = new ArrayList<>();

		list.add(new Student("Aman", 4));
		list.add(new Student("Ashutosh", 5));
		list.add(new Student("Aman2", 6));
		list.add(new Student("Parth", 2));
		list.add(new Student("suhel", 3));
		
		Student s1 = new Student("Parth", 2);
		Student s2 = new Student("aman2", 6);
		
//		System.out.println(s1.compareTo(s2));
		
//		Collections.sort(list, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		});
		
		Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name));
		
		System.out.println(list);
	}
	
}
