package algorithms.recursion;

public class SumExample {

	private static int sum(int a, int b) {
		if (a == 0 || b == 0) {
			return a + b;
		}
		return 2 + sum(a - 1, b - 1);
	}

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		System.out.println(sum(a, b));
	}
}
