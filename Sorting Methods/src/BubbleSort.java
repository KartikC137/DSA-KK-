import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {-1,32,33,334,-2323};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
          //run the steps n-1 times
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            //for each step max item will come at last respective index
            for(int j = 1; j <= arr.length-i-1; j++){
                // swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true; //flag that checks if values got swapped
                }
            }
            //if no swaps occurred, then the array was already sorted
            if(!swapped) { // i.e not swapped then break
                break;
            }
        }
    }
}
