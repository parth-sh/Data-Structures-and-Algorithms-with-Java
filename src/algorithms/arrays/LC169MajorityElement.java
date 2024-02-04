package dsa.arrays;

import java.util.Scanner;

public class LC169MajorityElement {

	/*
	 * https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=
	 * top-interview-150
	 * 
	 * Given an array nums of size n, return the majority element.
	 * 
	 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
	 * may assume that the majority element always exists in the array.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		int k = majorityElement(nums);
		System.out.println(k);

		scanner.close();
	}

	private static int majorityElement(int[] nums) {
		/*
		 * Brute Force Approach: Utilize a HashMap to track the frequency of each
		 * element in the array. Iterate through the array, adding each element as a key
		 * in the HashMap and incrementing its associated value to count occurrences.
		 * After completing the iteration, identify the key with the highest value in
		 * the HashMap, which represents the most frequent element.
		 */

//		int n = nums.length;
//		Map<Integer, Integer> hash = new HashMap<>();
//		for (int e : nums) {
//			hash.put(e, hash.getOrDefault(e, 0) + 1);
//		}
//		int keyWithMaxValue = -1, maxValue = Integer.MIN_VALUE;
//		for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
//			if (maxValue < entry.getValue()) {
//				maxValue = entry.getValue();
//				keyWithMaxValue = entry.getKey();
//			}
//		}
//		return keyWithMaxValue;

		/*
		 * (Efficient Approach) Moore's Voting Algorithm: Based on the principle of
		 * "pairing" and "canceling out" elements that are not in the majority.
		 * Initialize a candidate and a count. Iterate through the array, incrementing
		 * the count for matches with the candidate, and decrementing otherwise. Reset
		 * the candidate and count when count reaches zero. This process isolates the
		 * majority element, if present.
		 */
		int n = nums.length;
		int candidate = nums[0], count = 1;
		for (int i = 1; i < n; i++) {
			if (count == 0) {
				candidate = nums[i];
			}
			if (candidate == nums[i])
				count++;
			else
				count--;
		}
		return candidate;
	}
}
