package algorithms.recursion;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void toh(int n, char source, char helper, char destination) {
        if(n == 0) {
            return;
        }
        toh(n-1, source, destination, helper);
        System.out.println("Disk " + n + " moved from " + source + " to " + destination);
        toh(n-1, helper, source, destination);
	}

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            toh(n, 'A', 'B', 'C');
        }
    }
}
