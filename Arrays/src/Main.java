public class Main {
    public static void main(String[] args) {
        //syntax : datatype[] variable_name = new datatype[size];

//        int[] rnos = new int[5];
//
//        OR
//
//        int[] rnos2 = {69,420,33,99,34,23};


        int[] ros; //declaration of array; ros is getting defined in the stack
        ros = new int[5]; //initialisation; actual object is getting created in the heap

        // Array may not be contiguous in Java as the array objects are stored in heap.
        //Also arrays are dynamically allocated

    }
}