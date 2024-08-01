import java.util.Scanner;
public class StringType {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is your name sire?");
        String name = in.nextLine();
//        Greetings();
//        System.out.println(name);

//        String personalised = Greetings(name);
//        System.out.println(personalised);
        System.out.println(Greetings(name));
        String vent = in.next();
    }

    static String Greetings(String name) {
        return "Well how have you been, " + name + " ? \n" + "Go on, Share your feelings, its ok,no one is gonna read it:";
    }

//    static void Greetings() {
//        System.out.print("Well , well How are you ");
//    }
}

