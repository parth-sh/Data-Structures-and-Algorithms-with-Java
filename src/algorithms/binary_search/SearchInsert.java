package dsa.binary_search;

public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6}; // left = 0, right = 4, mid = 2
        int target = 2;
        // 2
        int n = arr.length;
        int left = 0, right = n-1, ub = n;
        while(left <= right) {
            int mid = (left + right)/2;
            if(arr[mid] == target) {
                ub = mid;
                break;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                ub = mid;
                right = mid - 1;
            }
        }
        System.out.println(ub);
    }
}