import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        // Syntax:

        ArrayList<Integer> list = new ArrayList<>(10);

        for(int i=1;i<=100;i++){list.add(i);}
        //and so on
        System.out.println(list);
        System.out.println(list.contains(101)); //false
        list.set(3,69); //set a value at some index (index,value)
        list.remove(5); //removes a value from specified index
        System.out.println(list.get(3)); //get the value at specified index

    }
}
