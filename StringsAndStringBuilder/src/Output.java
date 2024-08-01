import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        Integer num = new Integer(56); //marked for removal
        System.out.println(num.toString());
        System.out.println(num); //same thing
        System.out.println(Arrays.toString(new int[]{2,3,4,5,2}));
        System.out.println(new int[]{2,3,4,5,5});
    }
}