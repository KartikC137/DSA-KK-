package A2_first_java;
import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operator: ");
        char op = in.next().charAt(0);
        System.out.println("Enter the first value: ");
        double a = in.nextDouble();
        System.out.println("Enter the second value: ");
        double b  = in.nextDouble();
        if(op == '+'){
            System.out.println("Sum is:"+ (a+b));
        }
        else if(op == '-') {
            System.out.println("first value - second value = " + (a-b));
        } // and so on until
        else {
            System.out.println("not supported operator");
        }
    }
}
