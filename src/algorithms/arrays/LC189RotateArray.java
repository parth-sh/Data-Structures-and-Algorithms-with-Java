package dsa.arrays;

import java.util.Scanner;

public class LC189RotateArray {

	/*
	 * https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2
	 * &envId=top-interview-150
	 * 
	 * Given an integer array nums, rotate the array to the right by k steps, where
	 * k is non-negative.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		rotate(nums, k);
		printArr(nums, n);

		scanner.close();
	}

	private static void printArr(int[] nums, int n) {
		for (int e : nums) {
			System.out.print(e + " ");
		}
	}

	private static void rotate(int[] nums, int k) {
		/*
		 * Brute Force Approach: Execute a for loop that iterates 'k' times, each cycle
		 * representing one rotation. In each iteration, store the last element of the
		 * array in a temporary variable. Then, use a nested for loop to shift each
		 * element one position to the right, starting from the end of the array and
		 * moving towards the beginning. Finally, place the last element (stored in the
		 * temporary variable) at the first position of the array, completing one
		 * rotation.
		 * 
		 * Better Approach: Create a temporary array. Copy the last 'k' elements of the
		 * original array into the start of this temp array. Then, append the first
		 * 'n-k' elements of the original array to the temp array. This temp array now
		 * holds the rotated version of the original array.
		 * 
		 * Efficient Approach (Array Rotation using Reversal Algorithm): Reverse
		 * segments of the array in three steps: first, reverse indices 0 to k-1, then k
		 * to n-1, and finally, reverse the entire array. This rotates the array by 'k'
		 * positions.
		 */
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - k - 1);
		reverse(nums, n - k, n - 1);
		reverse(nums, 0, n - 1);
	}

	private static void reverse(int[] nums, int left, int right) {
		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}

}
