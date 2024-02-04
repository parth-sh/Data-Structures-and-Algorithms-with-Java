package dsa.binary_search;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = { 10, 20 ,30,30, 30, 40, 50 };
        int target = 30;
        int n = arr.length;
        int left = 0, right = n - 1, mid = 0, smallest_index = -1, largest_index = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] <= target) {
                largest_index = mid;
                left = mid + 1;
            } else {
                smallest_index = mid;
                right = mid - 1;
            }
        }
        System.out.println(largest_index - smallest_index + 1);
    }
}
