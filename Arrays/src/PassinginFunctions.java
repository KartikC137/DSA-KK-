import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] num = {3,69,4,34,23,2};

        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }

//    static int[] change(int[] arr) {
//        arr[0] = arr [1];
//        return arr;
//    }
    // change returns arr directly, as it is the type of array int

   static void change(int[] arr) {

        arr[0] = arr [1];

   }
}
// Hence Arrays are mutable in Java