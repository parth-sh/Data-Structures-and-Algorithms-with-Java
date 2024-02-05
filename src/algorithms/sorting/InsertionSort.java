package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            insertionSort(arr, n);
            print(arr, n);
        }
    }

    private static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
