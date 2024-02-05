package algorithms.sorting;

import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            shellSort(arr, n);
            print(arr, n);
        }
    }

    private static void shellSort(int[] arr, int n) {
        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                int i = j - gap;
                while (i >= 0 && arr[i] > arr[i + gap]) {
                    swap(arr, i, i + gap);
                    i = i - gap;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
