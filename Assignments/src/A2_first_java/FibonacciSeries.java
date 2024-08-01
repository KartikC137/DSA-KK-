package A2_first_java;
import java.util.Scanner;
public class FibonacciSeries {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the no. of terms: ");
      int n = in.nextInt();
      int a = 0, b = 1, c, temp;
      System.out.println("The Fibonacci series is: ");
      if (n > 1) {
          System.out.print(a + ",");
          System.out.print(b + ",");
          for (int i = 0; i < n - 2; i++) { //because 1 and 2 are already printed
              if (n == 0) {
                  System.out.println("Invalid value");
              } else {
                  c = a + b;
                  a = b;
                  b = c;
                  System.out.print(c + ",");
              }
          }
      }
      else{
          System.out.println(b);
      }
  }
}
