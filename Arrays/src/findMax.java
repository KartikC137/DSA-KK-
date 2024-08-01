import java.util.Arrays;

public class findMax
{
    public static void main(String[] args)
    {
       int[] example = {23,12,42,23,42,5,79,78,56,55};
       System.out.println(Arrays.toString(example));
       System.out.println("Max element ="+Max(example));
       reverse(example);
       System.out.println("Reversed array:"+Arrays.toString(example));
    }

    static void swap(int[] arr, int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

    static int Max(int[] arr)
    {
        int max = arr[0];
        for(int i=1; i<arr.length;i++)
         { if(arr[i] > max) { max = arr[i];}
         }
        return max;
    }
    static void reverse(int[] arr) //2 pointer method
    {
//     using for loop (complex)
//        for(int start=0,end=arr.length-1; start < arr.length/2 && end > (arr.length)/2; start++,end--){
//            swap(arr,start,end);
//        }
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
