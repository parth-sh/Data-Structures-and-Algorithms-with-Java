package algorithms.sorting;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            mergeSort(arr, 0, n - 1);
            print(arr, n);
        }
    }

    private static void print(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n = right - left + 1;
        int[] temp = new int[n];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right && k < n) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid && k < n) {
            temp[k++] = arr[i++];
        }
        while (j <= right && k < n) {
            temp[k++] = arr[j++];
        }
        for (i = left, j = 0; i <= right && j < n; i++, j++) {
            arr[i] = temp[j];
        }
    }
}