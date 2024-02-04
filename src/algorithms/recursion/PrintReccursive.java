package dsa.recursion;

public class PrintReccursive {

	private static void print(int n) {
		if (n == 0) {
			return;
		}
		print(n - 1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		int n = 7;
		print(n);
	}
}
