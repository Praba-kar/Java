import java.lang.*;
import java.util.*;

public class ReadKeyboard{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		System.out.println(num);

		System.out.println("enter the word");
		String word = sc.next();
		System.out.println(word);

		System.out.println("enter the scentence");
		String sent = sc.nextLine();
		System.out.println(sent);
		
	}
}