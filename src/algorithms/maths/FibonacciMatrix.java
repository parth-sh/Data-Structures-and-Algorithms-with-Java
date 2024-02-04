package algorithms.maths;
import java.util.Scanner;

public class FibonacciMatrix {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }

    // Brute force solution
    // private static long fibonacci(int n) {
    // long first = 0;
    // long second = 1;
    // long sum = 0;
    // if (n == 0)
    // return 0;
    // if (n == 1)
    // return 1;
    // for (int i = 1; i < n; i++) {
    // sum = first + second;
    // first = second;
    // second = sum;
    // }
    // return sum;
    // }

    // Better Approch
    // private static long fibonacci(int n) {
    // long[][] result = { { 1, 0 }, { 0, 1 } }; // Initialize as identity matrix
    // long[][] baseMatrix = { { 1, 1 }, { 1, 0 } };
    // if (n == 0)
    // return 0;
    // if (n == 1)
    // return 1;
    // for (int i = 1; i <= n - 1; i++) {
    // // Multiply result matrix by base matrix
    // result = multiply(result, baseMatrix);
    // }
    // return result[0][0]; // This cell contains Fn
    // }
    // private static long[][] multiply(long[][] m1, long[][] m2) {
    // long[][] result = new long[2][2];
    // for (int i = 0; i < 2; i++) {
    // for (int j = 0; j < 2; j++) {
    // for (int k = 0; k < 2; k++) {
    // result[i][j] += m1[i][k] * m2[k][j];
    // }
    // }
    // }
    // return result;
    // }

    // Optimal Approach
    private static long fibonacci(int n) {
        long[][] matrix = { { 1, 1 }, { 1, 0 } };
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        power(matrix, n - 1);
        return matrix[0][0];
    }

    private static void power(long[][] matrix, int n) {
        if (n <= 1) {
            return;
        }
        power(matrix, n / 2);
        multiply(matrix, matrix);
        if (n % 2 != 0) {
            long[][] fibMatrix = { { 1, 1 }, { 1, 0 } };
            multiply(matrix, fibMatrix);
        }
    }

    private static void multiply(long[][] m1, long[][] m2) {
        m1[0][0] = m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0];
        m1[0][1] = m1[0][0] * m2[0][1] + m1[0][1] * m2[1][1];
        m1[1][0] = m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0];
        m1[1][1] = m1[1][0] * m2[0][1] + m1[1][1] * m2[1][1];
    }
}
