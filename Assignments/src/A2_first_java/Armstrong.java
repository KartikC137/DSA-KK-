package A2_first_java;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int num1 = 111;
        System.out.println(isArmstrong(num));
        System.out.println(isArmstrong(num1));
    }

    static boolean isArmstrong(int n){
        int sum = 0,original = n;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + (rem*rem*rem);
        }
        return sum == original;
    }
}
