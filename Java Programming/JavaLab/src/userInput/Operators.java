package userInput;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second number : ");
		int b = sc.nextInt();
		
		System.out.println(a + " + "+ b +" = "+ (a+b));
		System.out.println(a + " - "+ b +" = "+ (a-b));
		System.out.println(a + " * "+ b +" = "+ (a*b));
		System.out.println(a + " / "+ b +" = "+ (a/b));
sc.close();
	}

}
