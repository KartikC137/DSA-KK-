package Questions;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        //check for first occurrence
        int start = OrderAgnosticBinarySearch(nums ,target, true);
        int end = OrderAgnosticBinarySearch(nums,target,false);

        ans[0] = start;
        ans [1] = end;

        return ans;

    }
    static int OrderAgnosticBinarySearch(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            //finding middle element
            //int mid = (start + end) / 2; //might be possible that start + end will exceed range of integer
            int mid = start + (end - start) / 2; //better way
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid; //potential answer i.e when nums[mid] == target
                if (findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }//answer found
        }
        return ans;
    }
}

