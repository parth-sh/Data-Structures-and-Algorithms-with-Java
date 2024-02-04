package dsa.sorting;
import java.util.Scanner;

public class BubbleSort {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int arr[], int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void bubbleSort(int arr[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		bubbleSort(arr, n);
		print(arr, n);
	}

}
