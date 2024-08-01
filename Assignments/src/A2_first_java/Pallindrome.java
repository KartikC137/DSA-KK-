package A2_first_java;
import java.util.Scanner;
public class Pallindrome{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String string = in.next();
		System.out.println(isPallindrome(string.toLowerCase()));
	}
	static boolean isPallindrome(String string){
		int i = 0;
		int j = string.length() - 1;
		while(i<j){
			if(string.charAt(i)!=string.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
