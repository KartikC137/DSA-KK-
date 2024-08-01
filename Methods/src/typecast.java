import java.util.Scanner;
public class typecast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        int a = 0,sum = 0; ;
        while(a != 120){
            a = (int)(in.next().charAt(0));
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
