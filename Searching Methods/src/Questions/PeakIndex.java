package Questions;
//peak index in mountain array
public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,5,7,8,9,10,11,12,3,0};
        System.out.println(peakIndex(arr));

    }



    static int peakIndex(int[] arr) {
            int start = 0;
            int end = arr.length -1;
            while(start < end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] > arr [mid+1]){
                    //You are in decreasing part of array
                    //maybe the ans , but also look at left part
                    end = mid;
                } else
                {
                    start = mid +1;
                } // because we know that mid + 1 element > mid element
                //in the end start == end , and pointing to the largest no. because of the checks above

            }
            return start;

        }

    }


