package Questions;

public class FindinginMountainArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,5,4};
        int target = 4;
        System.out.println(search(arr,target));

    }
    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr [mid+1]){

                end = mid;
            } else
            {
                start = mid +1;
            }

        }
        return start;

    }
    static int OrderAgnosticBinarySearch(int[] arr, int target, int start,int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2; //better way
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if(target<arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int search(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstry = OrderAgnosticBinarySearch(arr, target,0,peak);
        if(firstry != -1){
            return firstry;
        }

        return OrderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }

}

