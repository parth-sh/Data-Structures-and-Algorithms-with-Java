package algorithms.binary_search.cp;

import java.util.Scanner;

/*
 * https://www.spoj.com/problems/AGGRCOW/
 * */
public class AggressiveCows {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long t = scanner.nextLong();

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			long c = scanner.nextLong();

			long[] stalls = new long[n];
			for (int j = 0; j < n; j++) {
				stalls[j] = scanner.nextLong();
			}

//			System.out.println(n + " " + c);
//			for (long x : stalls) {
//				System.out.println(x);
//			}
			System.out.println(findMinDist(n, c, stalls));
		}
		scanner.close();
	}

	private static long findMinDist(int n, long c, long[] stalls) {
//		int left = 
		return 1l;
	}

}
