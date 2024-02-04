package algorithms.arrays;

import java.util.Scanner;

public class LC27RemoveElement {

	/*
	 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-
	 * v2&envId=top-interview-150
	 * 
	 * Given an integer array nums and an integer val, remove all occurrences of val
	 * in numsin-place. The order of the elements may be changed. Then return the
	 * number of elements in nums which are not equal to val.
	 * 
	 * Consider the number of elements in nums which are not equal to val be k, to
	 * get accepted, you need to do the following things:
	 * 
	 * Change the array nums such that the first k elements of nums contain the
	 * elements which are not equal to val. The remaining elements of nums are not
	 * important as well as the size of nums. Return k.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int val = scanner.nextInt();

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		int k = removeElement(nums, val);
		printArr(nums, k);

		scanner.close();
	}

	private static void printArr(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static int removeElement(int[] nums, int val) {
		/*
		 * Brute Force: Create a new array, exclude 'val', copy back to original.
		 * Slower, more space.
		 * 
		 * Better: Use two pointers at start. If not 'val', move both; else, move second
		 * pointer until non-'val' found, swap. Return first pointer's position, marking
		 * non-'val' elements.
		 */
		int n = nums.length;
		int first = 0, second = 0;
		while (first < n && second < n) {
			if (nums[second] != val) {
				swap(nums, first, second);
				first++;
				second++;
			} else {
				second++;
			}
		}
		return first;
	}

	private static void swap(int[] nums, int first, int second) {
		if (first == second)
			return;
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
}
