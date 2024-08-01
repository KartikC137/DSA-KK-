package A5_arrays;

import java.util.Arrays;

public class EQ4 {
    public static void main(String[] args) {
        int[][] nums = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(nums));

    }
    static public int maximumWealth(int[][] accounts){
        int n =  accounts.length;
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] = accounts[i][j];
            }
        }
        return findmax(sum);
    }
    static public int findmax(int[] sum){
        int max = sum[0];
        int n = sum.length;
        int i = 0;
        while (i < n){
            if(sum[i]>max){
                max = sum[i];
            }
            else{
                i++;
            }
        }
        return max;
    }
}
