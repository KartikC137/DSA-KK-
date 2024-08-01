package A2_first_java;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal value: ");
        float p = in.nextFloat();
        System.out.println("rate: ");
        float r = in.nextFloat();
        System.out.println("time: ");
        float t = in.nextFloat();
        System.out.println(SimpleInterest(p,r,t));

    }

    static float SimpleInterest(float principal, float rate, float time){
        return (principal*rate*time)/100;
    }
}
