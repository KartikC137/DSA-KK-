import java.util.Arrays;
import java.util.Scanner;
public class HCFandLCM {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nEnter a value for a: ");
        int a = in.nextInt();
        System.out.println("Enter a value for b: ");
        int b = in.nextInt();
        System.out.println("H.C.F and L.C.M of a and b is: " + Arrays.toString(HCFandLCM(a,b)));
    }
    static int[] HCFandLCM(int a,int b){
        if(a == 0 && b == 0){
            return new int[] {0,0};
        }
        if(a == 1 && b == 1){
            return new int[] {1,1};
        }
        int num,den,rem,temp=0;
        if(a>b){
            num = a;
            den = b;
        }else{
            num = b;
            den = a;
        }
        rem = num % den;

        while(rem!=0){
            temp = rem;
            rem = num % den;
            num = den;
            den = rem;
        }

        int hcf = temp;
        int lcm = (a*b)/hcf;
        return new int[] {hcf,lcm};
    }
}
