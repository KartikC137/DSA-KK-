public class Comparison {
    public static void main(String[] args) {
        //1st method
        String a = "Kartik";
        String b = "Kartik";
        System.out.println(a==b); //used to check if two reference variables point to same object
        //how to create diff. object of same value
        String l = new String("KK");
        String w = new String("KK");
        //Creates new object outside the string pool
        System.out.println(l==w);

        // 2nd method
        //When you only need to check value, use this method:

        String name1 = new String("Kartik");
        String name2 = new String("Kartik");

        System.out.println(name1.equals(name2));

    }
}
