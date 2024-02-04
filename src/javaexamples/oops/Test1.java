package javaexamples.oops;
import java.util.HashMap;
import java.util.Scanner;
public class Test1 {
	
//	Given an array nums of size n, return the majority element.
//	The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

	public static void main(String[] args) {
//		int arr[] = {2,2,1,1,1,2,2};
		int arr[] = {1,2,4,1,2,1,3,1};
//		int n = arr.length;
//		int count = 1;
//		int temp = arr[0];
//		for(int i=1;i<n;i++) {
//			if(temp == arr[i]) {count++;}
//			else {count--;}
//			
//			if(count == 0) {j
//				temp = arr[i];
//				count = 1;
//			}j
//		}
//		System.out.println(temp);
		
//		int n = arr.length;
//		HashMap<Integer, Integer> hash = new HashMap<>();
//		for(int i=0;i<n;i++) {
//			if(hash.containsKey(arr[i])) {
//				int count = hash.get(arr[i]);
//				hash.put(arr[i], count++);
//			} else {
//				hash.put(arr[i], 0);
//			}
//		}
//		for(MapEntries<Integer, Integer> e: hash.entrySet()) {
//			if(e.values > n/2) {
//				return e.key();
//			}
//			return -1;
//		}
		
//		
		int prices[] = new int[]{7,1,5,3,6,4};
		int n = prices.length;
		int profit = 0;
		int mini_price = prices[0];
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				int curr_profit = prices[j] - prices[i];
//				if(curr_profit > profit) {
//					profit = curr_profit;
//				}
//			}
//		}
//		System.out.println(profit);
		
		for(int i=1;i<n;i++) {
			int curr_profit = prices[i] - mini_price;
			if(curr_profit > profit) {profit = curr_profit;}
			
			if(mini_price > arr[i]) {mini_price = prices[i];}
		}
		System.out.println(profit);
	}
	
}
