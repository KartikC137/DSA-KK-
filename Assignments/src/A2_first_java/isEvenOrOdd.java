package A2_first_java;

import java.util.Scanner;

public class isEvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int num = in.nextInt();

        if(isEven(num)){
            System.out.println("No. is Even");
        }else{
            System.out.println("No. is Odd");
        }

    }

    static boolean isEven(int a){
          return a % 2 == 0;
        }
    }

