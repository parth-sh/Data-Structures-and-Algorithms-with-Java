package dsa.binary_search;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 12, 13 };
        int target = 4;
        int n = arr.length;
        int left = 0, right = n - 1, mid = 0, ans = -1;
        while (left <= right) {
            mid = (left + right)/2;
            if(arr[mid] >= target) {
                ans = arr[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
