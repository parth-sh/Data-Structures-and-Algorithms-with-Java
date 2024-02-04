package dsa.binary_search;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 12, 13 };
        int target = 4;
        int n = arr.length;
        int left = 0, right = n - 1, mid = 0, index = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < target) {
                index = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(index);
    }
}
