package dsa.arrays;

import java.util.Scanner;

public class LC80RemoveDuplicatesfromSortedArrayII {

	/*
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
	 * description/?envType=study-plan-v2&envId=top-interview-150
	 * 
	 * Given an integer array nums sorted in non-decreasing order, remove some
	 * duplicates in-place such that each unique element appears at most twice. The
	 * relative order of the elements should be kept the same.
	 * 
	 * Since it is impossible to change the length of the array in some languages,
	 * you must instead have the result be placed in the first part of the array
	 * nums. More formally, if there are k elements after removing the duplicates,
	 * then the first k elements of nums should hold the final result. It does not
	 * matter what you leave beyond the first k elements.
	 * 
	 * Return k after placing the final result in the first k slots of nums.
	 * 
	 * Do not allocate extra space for another array. You must do this by modifying
	 * the input array in-place with O(1) extra memory.
	 * 
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
		 * Edge Case: If the input array contains only one or two elements, simply
		 * return the length of the array as no duplicates can occur in such a scenario.
		 * 
		 * Brute Force Approach: Create a temporary array and initialize it with the
		 * first two elements of the original array. Set the first pointer to the last
		 * element of the temporary array and the second pointer to the third element of
		 * the original array. Iterate through the original array with the second
		 * pointer, comparing the current element with the last two elements of the
		 * temporary array. If they match, move the second pointer to the next element.
		 * If not, add the element to the temporary array and adjust the first pointer
		 * accordingly.
		 */

//		int n = nums.length;
//		int[] temp = new int[n];
//		if (n == 1 || n == 2) {
//			return n;
//		}
//		temp[0] = nums[0];
//		temp[1] = nums[1];
//		int first = 1, second = 2;
//		while (first < n && second < n) {
//			if (nums[second] == temp[first] && nums[second] == temp[first - 1]) {
//				second++;
//			} else {
//				first++;
//				temp[first] = nums[second];
//				second++;
//			}
//		}
//		for (int i = 0; i <= first; i++) {
//			nums[i] = temp[i];
//		}
//		return first + 1;

		/*
		 * Efficient Approach: To solve this without extra space, use a two-pointer
		 * method. Place the first pointer at index 1 and the second pointer at index 2
		 * of the array. Iterate through the array, comparing the element at the second
		 * pointer with the elements at the first pointer and its preceding index (first
		 * - 1). If they are identical, move the second pointer forward. If they differ,
		 * increment the first pointer and swap the elements at the first and second
		 * pointers.
		 */

		int n = nums.length;
		if (n == 1 || n == 2) {
			return n;
		}
		int first = 1, second = 2;
		while (first < n && second < n) {
			if (nums[second] == nums[first] && nums[second] == nums[first - 1]) {
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
