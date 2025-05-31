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

		sc.nextLine();

		System.out.println("enter the scentence");
		String sent = sc.nextLine();
		System.out.println(sent);

		int x,y;
		System.out.println("enter two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		
		int z = x+y;
		System.out.println("sum of two number is: "+z);


		
	}
}
