package dsa.binary_search.cp;

import java.util.Scanner;

/*
 * https://codeforces.com/problemset/problem/1613/C
 * */

public class MonocarpGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long t = scanner.nextLong();

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			long h = scanner.nextLong();

			long[] attacks = new long[n];
			for (int j = 0; j < n; j++) {
				attacks[j] = scanner.nextLong();
			}

			System.out.println(findMinK(n, h, attacks));
		}
		scanner.close();
	}

	private static long findMinK(long n, long h, long[] attacks) {
		long left = 1, right = h; // left = 1, right = 1000
		while (left <= right) {
			long mid = left + (right - left) / 2; // mid = 502
			long damage = calcDamage(attacks, mid, n);

			if (damage == h) {
				return mid;
			} else if (damage > h) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	private static long calcDamage(long[] attacks, long mid, long n) {
		long damage = 0;
		for (int i = 1; i < n; i++) {
			damage += Math.min(mid, attacks[i] - attacks[i - 1]);
		}
		damage += mid;
		return damage;
	}
}
