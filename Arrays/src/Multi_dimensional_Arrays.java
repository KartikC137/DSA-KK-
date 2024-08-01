import java.util.Arrays;
import java.util.Scanner;

public class Multi_dimensional_Arrays
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*
        a v v
        d v n
        g h k
         */
        //example 2d array (3x3 matrix)

        //Syntax : data_type[][] name = new date_type[rows][column];

//        char[][] arr2 = {
//                {'a','v','v'},
//                {'d','v','n'},
//                {'g','h','k'}
//
//        };
//
//        System.out.println(Arrays.deepToString(arr2)); // deepToString to print 2d arrays
//        System.out.println(arr2.length); //no. of rows
        //input:
        int[][] arr2D = new int[4][3];
        for(int row = 0;row < arr2D.length;row++)
        {
            for(int column = 0;column<arr2D[row].length;column++)
            {
                System.out.println("Enter element for position:" + row + "x" + column + ":" );
                arr2D[row][column] = in.nextInt();
            }
        }
        System.out.println("The 2D array is:"+Arrays.deepToString(arr2D));

    }

}
