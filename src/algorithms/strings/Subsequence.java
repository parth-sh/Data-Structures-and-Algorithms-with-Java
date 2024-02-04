package dsa.strings;

public class Subsequence {

	public static void main(String[] args) {
		String s1 = "abcdebabdba";
		String s2 = "cebd";
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int n1 = arr1.length;
		int n2 = arr2.length;

		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			while (arr1[i] != arr2[j])
				i++;
			j++;
		}
		if (j == n2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
