package dsa.sorting;
import java.util.Scanner;

public class MergeSort {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		mergeSort(arr, 0, n-1);
		print(arr, n);
	}

	private static void print(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void mergeSort(int[] arr, int left, int right) {
		if(left >= right) {
			return;
		}
		int middle = left + (right - left)/2;
		mergeSort(arr, left, middle);
		mergeSort(arr, middle + 1, right);
		merge(arr, left, middle, right);
	}

	private static void merge(int[] arr, int left, int middle, int right) {
		int n = right - left + 1;
		int[] temp = new int[n];
		int i = left, j = middle + 1, k = 0;
		while(i <= middle && j <= right && k < n) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		while(i <= middle && k < n) {
			temp[k++] = arr[i++];
		}
		while(j <= right && k < n) {
			temp[k++] = arr[j++];
		}
		for(i=left, j=0; i<= right && j <= n ; i++, j++) {
			arr[i] = temp[j];
		}
	}
}