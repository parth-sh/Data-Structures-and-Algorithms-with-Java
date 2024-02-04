package algorithms.arrays;

import java.util.Scanner;

public class LC26RemoveDuplicatesFromSortedArray {

	/*
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description
	 * /?envType=study-plan-v2&envId=top-interview-150
	 * 
	 * Given an integer array nums sorted in non-decreasing order, remove the
	 * duplicates in-place such that each unique element appears only once. The
	 * relative order of the elements should be kept the same. Then return the
	 * number of unique elements in nums.
	 * 
	 * Consider the number of unique elements of nums to be k, to get accepted, you
	 * need to do the following things:
	 * 
	 * Change the array nums such that the first k elements of nums contain the
	 * unique elements in the order they were present in nums initially. The
	 * remaining elements of nums are not important as well as the size of nums.
	 * Return k.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		int k = removeDuplicates(nums);
		printArr(nums, k);

		scanner.close();
	}

	private static void printArr(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static int removeDuplicates(int[] nums) {
		/*
		 * 
		 * Brute Force Approach: Initialize a temporary array and populate it with the
		 * first element of the input array. Then, iterate through the input array,
		 * adding elements to the temporary array only if they differ from the most
		 * recently added element. This approach effectively removes consecutive
		 * duplicates.
		 * 
		 * Efficient Approach: Implement a two-pointer technique. Start both pointers at
		 * index 0. If the elements at both pointers are identical, increment the second
		 * pointer until a distinct element is found. Once a different element is
		 * encountered, increment the first pointer and swap the values at the two
		 * pointers. Finally, return the value of the first pointer plus one,
		 * representing the count of unique elements.
		 */
		int n = nums.length;
		int first = 0, second = 0;
		while (first < n && second < n) {
			if (nums[first] == nums[second]) {
				second++;
			} else {
				first++;
				swap(nums, first, second);
				second++;
			}
		}
		return first + 1;
	}

	private static void swap(int[] nums, int first, int second) {
		if (first == second)
			return;
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}

}
