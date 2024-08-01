package A5_arrays;

import java.util.Arrays;

public class EQ3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static public int[] runningSum(int[] nums){
        int sum = 0;
        int n = nums.length;
        for (int i = 1; i < n ; i++) {
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}
