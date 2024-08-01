package CyclicSort;

public class SetMismatch {



    static public int[] findErrorNums(int[] nums){

        int i=0;
        while(i<nums.length)
        {
            int correct = nums[i]-1;

            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        int[] ans = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return new int[] {nums[j],j+1};
            }

        }

         return new int[0];
    }
    static void swap(int[] nums, int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

