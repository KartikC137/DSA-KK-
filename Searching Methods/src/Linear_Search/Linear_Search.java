package Linear_Search;

import java.util.Arrays;
import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("\n 1.Linear Search in Array\n 2.Linear Search in String\n 3.Linear Search in 2D array\n 0.Quit \n"+"Enter your choice:");
        int flag = in.nextInt();
        while(flag!=0) {
            if (flag == 1) {
                System.out.print("Enter the no. of elements: ");
                int n = in.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the elements for the array:");
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println("The Array is:" + Arrays.toString(arr));
                System.out.print("Enter the key element to search for: ");
                int key = in.nextInt();
                int r = LinearSearch(arr, key);

                if (r == -1) {
                    System.out.println("Empty Array");
                } else if (r == 0) {
                    System.out.println("Element Not Found");
                } else {
                    System.out.println("Element found at position: " + (r + 1));
                }
                flag = 0;
            }
            //Linear searching in a String
            if (flag == 2) {
                System.out.print("Enter a string data to search from: ");
                String str = in.next();
                System.out.println("Enter the character to search for:");
                char target = in.next().charAt(0);
                boolean s = StringSearch(str, target);
                if (s == false) {
                    System.out.println("Character not found in the String Or it is an empty string");
                } else {
                    System.out.println("Character is present in String");
                }
                flag = 0;
            }
            //Linear Search in 2d array
            if (flag == 3) {
                System.out.println("Enter the size of 2D array (Rows followed by column): ");
                int i = in.nextInt();
                int j = in.nextInt();
                int[][] arr2D = new int[i][j];
                for (int row = 0; row < arr2D.length; row++) {
                    for (int column = 0; column < arr2D[row].length; column++) {
                        System.out.println("Enter element for position:" + row + "x" + column + ":");
                        arr2D[row][column] = in.nextInt();
                    }
                }
                System.out.println("The Array is:" + Arrays.deepToString(arr2D));
                System.out.print("Enter the key element to search for: ");
                int key = in.nextInt();
                int[] r = LinearSearch(arr2D, key);

                if (r == new int[]{-1, -1}) {
                    System.out.println("Empty Array");
                } else if (r == new int[] {0,0}) {
                    System.out.println("Element Not Found");
                } else{
                    System.out.println("Element found at row: "+ (r[0]+1)+" Column: "+(r[1]+1));
                }
                flag = 0;
             }

            }
        }

    static int LinearSearch(int[] arr, int key) {
        if(arr.length==0){return -1;}

        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i] == key) { return i;}
        }
        return 0;
    }
    static boolean StringSearch(String str,char target) {
        if(str.length()==0){return false;}
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){return true;}
        }
        return false;
    }
    static int[] LinearSearch(int[][] arr2D,int key) {
        if(arr2D.length==0){return new int[]{-1,-1};}
        for(int i = 0;i < arr2D.length;i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] == key) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

}