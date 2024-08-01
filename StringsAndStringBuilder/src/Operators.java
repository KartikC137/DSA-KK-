import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a" + 1);
        // integer will be converted into Integer that will call toString()

        System.out.println("Kk" + new ArrayList<>());
        System.out.println("Kk" + new Integer(56));
        //System.out.println(new Integer(56) + new ArrayList<>());
        //Condition = This operator can be used on complex objects, but with at least one string
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
