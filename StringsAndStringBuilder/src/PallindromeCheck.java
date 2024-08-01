import java.util.Arrays;

public class PallindromeCheck {
    public static void main(String[] args) {
        String example = new String();
        example = "Do geese see God";
        String tocheck = example.toLowerCase().replaceAll("\\s","");
        int start = 0;
        int end = tocheck.length()-1;
        while(end>0&&start!=end){
            if (tocheck.charAt(start) == tocheck.charAt(end)) {
                start++;
                end--;
            }
            else{
                System.out.println("Not a Pallindrome");
                start++;
                break;
            }
        }
        if(start == end) {
            System.out.println("It is a Pallindrome");
        }
        System.out.println(isPallindrome(example));
    }
    //or
    public static boolean isPallindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase().replaceAll("\\s","");
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}