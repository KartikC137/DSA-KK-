package CyclicSort;

public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,4,3,2};
        System.out.println(findDuplicate(nums));
    }

    static public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for(int i:nums){
            if(arr[i]) return i;
            arr[i]=true;
        }
        return 0;
    }







    //Using cyclic sort
//    static int findDuplicates(int[] nums){
//        int i=0;
//        while(i<nums.length)
//        {
//            if(nums[i]!=i+1) {
//                int correct = nums[i] - 1;
//                if (nums[i] != nums[correct]) {
//                    swap(nums, i, correct);
//                } else {
//                    return nums[i];
//                }
//            }else {
//                i++;
//            }
//        }
//        return -1;
//    }
//
//    static void swap(int[] nums,int first,int second){
//        int temp = nums[first];
//        nums[first] = nums[second];
//        nums[second] = temp;
//    }

    //OR




}

