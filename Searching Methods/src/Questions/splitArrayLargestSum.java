package Questions;

public class splitArrayLargestSum {
    public static void main(String[] args) {


    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j); // in the end of loop, it will contain max item from the array
            end += j;
        }
        //Binary search
        while(start<end){
            //try middle for potential answer
            int mid = start + (end - start)/2;
            //calculate how many pieces can you divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid) {
                    //you cannot add this in subarray make a new one
                    //say you add this in new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum +=num;
                }

            }

            if(pieces > k){
                start = mid + 1;
            }
            else {
                end = mid;
            }


        }

        return end; //because here start == end

    }

}

