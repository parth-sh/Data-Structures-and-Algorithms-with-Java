package dsa.recursion;

import java.util.Scanner;

public class LC8StringtoIntegerAtoi {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.nextLine();
			System.out.println(myAtoiRecursive(s.toCharArray(), 0, 0, 1, false));
		}
	}

//	private static int myAtoi(String s) {
//		char arr[] = s.toCharArray();
//		int n = arr.length, i = 0, sign = 1;
//		long res = 0;
//		while (i < n && arr[i] == ' ') {
//			i++;
//		}
//		if (i < n && arr[i] == '-') {
//			sign = -1;
//			i++;
//		} else if (i < n && arr[i] == '+') {
//			sign = 1;
//			i++;
//		}
//		while (i < n) {
//			int digit = arr[i] - '0';
//			if (0 <= digit && digit <= 9) {
//				res = res * 10 + digit;
//				if (res > Integer.MAX_VALUE) {
//					return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
//				}
//			} else {
//				break;
//			}
//			i++;
//		}
//		res = sign * res;
//		return (int) res;
//	}

	/*
	 * Recursive way:
	 */
	private static int myAtoiRecursive(char[] arr, int i, long res, int sign, boolean numberStarted) {
		if (i >= arr.length) {
			return (int) (sign * res);
		}
		if (!numberStarted) {
			if (arr[i] == ' ') {
				return myAtoiRecursive(arr, i + 1, res, sign, false);
			} else if (arr[i] == '-') {
				return myAtoiRecursive(arr, i + 1, res, -1, true);
			} else if (arr[i] == '+') {
				return myAtoiRecursive(arr, i + 1, res, 1, true);
			}
		}
		int digit = arr[i] - '0';
		if (0 <= digit && digit <= 9) {
			res = res * 10 + digit;
			if (res > Integer.MAX_VALUE) {
				return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			return myAtoiRecursive(arr, i + 1, res, sign, true);
		}
		return (int) (sign * res);
	}
}
