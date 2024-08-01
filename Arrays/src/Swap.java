import java.util.Arrays;
public class Swap
{
    public static void main(String[] args)
    {
        int[] nums = {60,3,23,69,23,12,22};
        System.out.println("original array:"+Arrays.toString(nums)+" ");
        swap(nums,1,4);
        System.out.println("After Swaping:"+Arrays.toString(nums)+" ");

    }

    static void swap(int[] arr, int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
