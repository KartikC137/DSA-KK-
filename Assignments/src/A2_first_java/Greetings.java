package A2_first_java;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = in.next();
        System.out.println(Greetings(name));

    }

    static String Greetings(String name){
        return "Hello\t" + name;
    }
}
