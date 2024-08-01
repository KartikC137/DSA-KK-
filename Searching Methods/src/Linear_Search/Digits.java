package Linear_Search;

public class Digits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896,45,3,3,3,-34,-53535335};
        System.out.println(findnumberofdigits(arr));

    }

    // function to number of digits of the integers in an array
    static int findnumberofdigits(int[] arr){
        int count = 0;
       for (int num:arr){
           if(even(num)){
               count++;
           }
       }
        return count;
    }

    //function to check if the total no. of digits in an integer is even

    static boolean even(int num) {
        if(num<0){ num*=-1;}
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        return count%2==0;
    }
    //Can use (int)(Math.log10(num)+1) to get no. of digit to optimise code
}
