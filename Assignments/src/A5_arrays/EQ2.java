package A5_arrays;

import java.util.Arrays;

public class EQ2 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

   static public int[] getConcatenation ( int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            if(i < n){
               ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i-n];
            }
        }
        return ans;
    }
}
