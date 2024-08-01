package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] test = {34,56,77,78,89,90,103};
        int target = 12;
        System.out.println(BinarySearch(test,target));

    }

    //return the index
    //return -1 if it does not exist
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


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


