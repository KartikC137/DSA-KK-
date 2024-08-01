package Questions;

public class SearchInInfiniteSizeArray {
    public static void main(String[] args) {

        int[] array  = {1,2,34,45,65,77,78,88,89,90,91,92,93,94,95,96,97};
        int key = 65;
        System.out.println(ans(array,key));

    }
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;

        while(target>arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;

        }
        return BinarySearch(arr,target,start,end);


    }
    static int BinarySearch(int[] arr, int target,int start,int end) {


        while (start <= end) {
            //finding middle element
            //int mid = (start + end) / 2; //might be possible that start + end will exceed range of integer
            int mid = start + (end - start) / 2; //better way
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }//answer found
        }
        return -1;
    }


}
