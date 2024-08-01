package Questions;



public class Ceiling {
    public static void main(String[] args) {
        char[] arr ={'a','e','i','o','u'};
        char t = 'g';
        int[] arr1 = {34,45,67,87,97,101};
        int t1 = 98;
        System.out.println(Ceiling(arr,t));
        System.out.println(Ceiling(arr1,t1));
        System.out.println(floor(arr1,t1));
        //or floor = Ceiling - 1
    }
    //return the index of smallest no. which is greater than or equal to target
    static int Ceiling(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }
           }
         return arr[start % arr.length];
         }



    static int Ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]) {return -1;}
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }
            else{return mid;}
        }
        return start; //return the next value greater than target, as in the end, start = end + 1
    }


    static int floor(int[] arr, int target) {
        //if (target < arr[0]) {return -1;}, it will return -1 any-ways
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }
            else{return mid;}
        }
        return end; //return the next value less than target, as in the end, start = end + 1
    }

    }

