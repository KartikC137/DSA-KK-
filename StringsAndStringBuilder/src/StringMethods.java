import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kartik Kumbhar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('u'));
        System.out.println("     remove Spaces     ".strip());
        System.out.println(Arrays.toString(name.split("a")));
    }
}
