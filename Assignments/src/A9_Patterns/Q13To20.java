package A9_Patterns;

public class Q13To20 {
    public static void main(String[] args) {
        pattern13(5);
        pattern14(10);
        pattern15(7);
        pattern16(5);
        pattern17(4);
        pattern18(5);
        pattern19(5);
        pattern20(5);
    }

    private static void pattern20(int n) {
    }

    private static void pattern19(int n) {
    }

    private static void pattern18(int n) {
    }

    private static void pattern17(int n) {
        for (int i = 0; i < 2*n-1; i++) {
            if(i>=n){
                for (int j = 0; j <= i-n+1; j++) {
                    System.out.print(" ");
                }
                for (int j = 4;j <= 2*(2*n-i);j++) {
                    int k = 1;
                    if(j>=(2*n-i)/2){
                        System.out.print(k+1);
                    } else {
                        System.out.print("&");
                    }
                }
            } else {
                for (int j = n-i-1; j >= 0 ; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i+1;j++) {
                    if(j>=i){
                      System.out.print(j-i+1);
                    } else {
                      System.out.print(j+2);
                    }
                }
            }
            System.out.println();
        }
    }

    private static void pattern16(int n) {
        //pascals triangle
    }

    private static void pattern15(int n) {
        for (int i = 1; i < 2*n; i++) {
            if(i>=n) {
                for(int j = 1; j <= i-n;j++){
                    System.out.print(" ");
                }
                for(int j = 2*(2*n-i)-1; j > 0;j--){
                    if(j==1||j==2*(2*n-i)-1){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = n-i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2*i-1;j++){
                    if(j==1||j==2*i-1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2*(n-i)+1; j > 0; j--) {
                if (i == 1 || j == 1 || j == 2*(n-i)+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
