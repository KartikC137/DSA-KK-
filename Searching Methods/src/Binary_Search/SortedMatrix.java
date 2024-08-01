package Binary_Search;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        int target = 16;
        System.out.println(Arrays.toString(search(matrix,target)));

    }

    static int[] binarySearch(int[][] matrix,int row,int colstart,int colend,int target){
      while(colstart <= colend){
          int mid = colstart + (colend - colstart)/2;
          if( matrix[row][mid] == target) {
              return new int[] {row,mid};
          }
          if( matrix[row][mid] < target){
              colstart = mid + 1;
          } else {
              colend = mid - 1;
          }

      }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] matrix,int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if(col == 0){
            return new int[] {0,0};
        }

        if(row == 1){
            return binarySearch(matrix,0,0,col-1,target);
        }
        int rStart = 0;
        int rEnd = row - 1;
        int cmid = col/2;
        //run the loop till two rows are remaining

        while(rStart<(rEnd-1)) //this will be true for all the cases for more than 2 last rows
        {
           int mid = rStart + (rEnd -rStart) /2;
           if(matrix[mid][cmid] == target){
               return new int[] {mid,cmid};
           }
           if(matrix[mid][cmid] < target){
               rStart = mid;
           } else {
               rEnd = mid;
           }
           //now we have two rows
            //check whether the target is in the col of 2 rows

            if(matrix[rStart][cmid] == target){
                return new int[]{rStart,cmid};
            }
            if(matrix[rStart + 1][cmid] == target) {
                return new int[]{rStart+1,cmid};
            }
        }

        //search in 1st half
        if(target <= matrix[rStart][cmid-1]){
           return binarySearch(matrix,rStart,0,cmid-1,target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][cmid+1] && target <= matrix[rStart][col-1]){

            return binarySearch(matrix,rStart,cmid+1,col - 1,target);
        }
        //search in 3rd half
        if(target <= matrix[rStart +1][cmid-1]){
            return binarySearch(matrix,rStart+1,0,cmid - 1,target);
        }
        //4th half
        else {
            return binarySearch(matrix,rStart+1,cmid+1,col - 1,target);
        }



    }
}




