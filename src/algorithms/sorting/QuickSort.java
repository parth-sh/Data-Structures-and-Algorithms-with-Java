package algorithms.sorting;
import java.util.Scanner;

public class QuickSort {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		quickSort(arr, 0, n-1);
		print(arr, n);
	}

	private static void print(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		int pivot_idx = partition(arr, start, end);
		quickSort(arr, start, pivot_idx - 1);
		quickSort(arr, pivot_idx + 1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start, j = end;
		while(i < j) {
			while(arr[i] <= pivot && i <= end) {i++;}
			while(arr[j] > pivot && j >= start) {j--;}
			if(i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, j, start);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
