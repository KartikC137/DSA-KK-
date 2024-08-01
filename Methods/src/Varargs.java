import java.util.Arrays;
import java.util.Scanner;
public class Varargs {
    public static void main(String[] args) {
        fun(8,4,4,5,3,4,3,4,5,3,5,34,34,2,3,5);

    }


static void fun(int ...v) {
    System.out.println(Arrays.toString(v));
}
}