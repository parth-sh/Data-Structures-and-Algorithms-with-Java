
package javaexamples.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		Integer[] arr = new Integer[30];
		arr[29] = Integer.valueOf(1);
		
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("Parth");
		arrList.add("Sharma");
		
		List<Integer> arrList2 = new ArrayList<>();
		
		arrList2.add(10);
		arrList2.add(20);
		arrList2.add(30);
		arrList2.add(40);
		
		arrList2.add(1, 15);
		
		arrList.addAll(new ArrayList<>());
		
		arrList2.remove(2);
		
		arrList2.remove(Integer.valueOf(15));
		
//		arrList2.clear();
		
		arrList2.set(2, 1000);
		
//		System.out.println(arrList2.contains(1000));
		
//		for(int i=0;i<arrList2.size();i++) {
//			System.out.println("the element is " + arrList2.get(i));
//		}
//		
//		for(Integer ele: arrList2) {
//			System.out.println("for each element is " + ele);
//		}
		
//		Iterator<Integer> it = arrList2.iterator();
//		while(it.hasNext()) {
//			System.out.println("Iterator: " + it.next());
//		}
	}

}
