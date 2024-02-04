package algorithms.sorting;
import java.util.Scanner;

public class SelectionSort {

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

    public static void selectionSort(int arr[], int n) {
        for(int i=0;i<n;i++) {
            int min_idx = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            if(i != min_idx) {
                swap(arr, i, min_idx);
            }
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        selectionSort(arr, n);
        print(arr, n);
    }
}