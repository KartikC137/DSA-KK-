package Questions;

import Binary_Search.BinarySearch;

public class RotateBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));

    }

    static public int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicated(nums);
        //if pivot wasn't found, just do normal search as it won't be rotated
        if(pivot == -1) {
            return BinarySearch(nums,target,0,nums.length-1);
        }
        if(pivot == target) {
            return target;
        }

            //if pivot is found , that mean two ascending arrays
        if(target>nums[0]){ //all elements after pivot are going to be smaller than start elements(till pivot)
            return BinarySearch(nums,target,0,pivot-1);
        } else {
            return BinarySearch(nums,target,pivot+1,nums.length-1);
        }

    }

    static int BinarySearch(int[] arr, int key,int start, int end) {

        while(start<=end){
            int mid = start + (end - start)/2;
            if(key > arr[mid]){
                start = mid+1;
            }
            else if(key < arr[mid]){
                end = mid;
            }
            else{return mid;}
        }
        return -1;
    }
    static int findPivotWithDuplicated(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){ //case 1
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid+1]){ //case 2
                return mid-1;
            }
           //if elements at start,end and middle are equal, skip the duplicates
            if(arr[mid]==start && arr[mid]==end) {
                //What if they were pivots?
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
                //left is sorted , pivot is in right
                else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                    start = mid + 1;
            } else {
                    end = mid - 1;
            }
        }
        return -1;
    }
}
