import java.util.Arrays;
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < arr.length; i++ ) {

            arr[i] = in.nextInt();
        }

//        for (int i = 0; i<arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }
//
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
       //num represents array element itself

        System.out.println(Arrays.toString(arr));
        //best way to print

        //Array of objects:

        String[] str = new String[5];
        System.out.println("Enter the string objects:");
        for(int i = 0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.print(Arrays.toString(str));
    }
}
