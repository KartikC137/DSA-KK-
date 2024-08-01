import java.util.Scanner;
public class Sum {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter first no.");
        int num1 = in.nextInt();
        System.out.println("Enter second no.:");
        int num2 = in.nextInt();
        //sum();
        System.out.println("And now, again the sum is:");
        System.out.println(sum(num1,num2));
    }

    static void sum() {
        System.out.println("Enter first no.");
        int num1 = in.nextInt();
        System.out.println("Enter second no.:");
        int num2 = in.nextInt();

        System.out.println("The sum is:");
        System.out.println(num1+num2);
    }

    static int sum(int a, int b) {
        int sum = a +b;
        return sum;
    }
}
