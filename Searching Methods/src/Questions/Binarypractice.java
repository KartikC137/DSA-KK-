package Questions;

import java.util.Arrays;

public class Binarypractice {
    public static void main(String[] args) {
        int[] arr = {22,45,66,77,77,89,90};
        int key = 77;
        System.out.println(Arrays.toString(findindexarray(arr,key)));

    }
//    @Contract(pure = true)
    static int BinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;
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

    static int [] findindexarray(int[] array, int key){
        int[] ans = {-1,-1};
        ans[0] = binarysearch(array,key,true);
        ans[1] = binarysearch(array,key,false);
        return ans;
    }

    static int binarysearch(int[] arr, int key, boolean direction){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(key > arr[mid]){
                start = mid+1;
            }
            else if(key < arr[mid]){
                end = mid-1;
            }
            else{
                result = mid;
                if(direction){
                  end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return result;

    }
}
