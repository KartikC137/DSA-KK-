import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {-1,32,33,334,-2323};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for(int j = i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    swap(array,j,j-1);
                } else {
                    break;
                }

            }
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
