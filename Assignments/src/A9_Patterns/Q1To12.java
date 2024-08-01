package A9_Patterns;

public class Q1To12 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(144);

    }


    static void pattern1(int n){
        //Q1
        for(int rows = 1 ;rows <= n;rows++){
            for (int columns = 1; columns <= n; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); //to separate from next question
    }
    static void pattern2(int n){
        //Q2
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern3(int n){
        //Q3
        for (int rows = n; rows > 0; rows--) {
            for (int columns = rows; columns > 0; columns--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        //Q4
        for (int rows = 0; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int rows = 0; rows < (2*n); rows++) {
            if(rows>n){
                for(int col = (2*n)-rows+1;col > 1; col --){
                    System.out.print("*");
                }
            } else {
                for (int col = 0; col < rows; col++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern6(int n){
        for (int i = 0; i < n ; i++) {
            for (int spaces = n - i - 1; spaces > 0 ; spaces--) {
                System.out.print(" ");
            }
            for (int astericks = 0; astericks <= i; astericks++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }
            for(int astericks = n - i;astericks > 0;astericks--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern8(int n){
        for(int i=0;i<=n;i++){
            for(int spaces =n-i-1;spaces>=0;spaces--){
                System.out.print(" ");
            }
            for(int ast = 1; ast <= 2*i-1; ast++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern9(int n){
        for(int i=0;i<=n;i++){
            for(int spaces=0;spaces<i;spaces++){
                System.out.print(" ");
            }
            for(int ast = 2*(n-i)-1;ast>0;ast--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern10(int n) {
        for(int i=0;i<=n;i++){
            for (int spaces = n-i; spaces >0; spaces--) {
                System.out.print(" ");
            }
            for (int ast = 0; ast < i; ast++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern11(int n) {
        for(int i=0;i<=n;i++){
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }
            for (int ast =n-i ;ast>0 ; ast--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern12(int n) {
        for(int i = 1;i<=2*n;i++){
            if(i>n){
                for (int spaces=2*n-i; spaces > 0; spaces--) {
                    System.out.print(" ");
                }
                for (int ast=1 ; ast <= i-n;ast++){
                    System.out.print("* ");
                }
            }
            else{
                for (int spaces = 1; spaces < i; spaces++) {
                    System.out.print(" ");
                }
                for(int ast = n-i+1; ast > 0 ;ast--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
