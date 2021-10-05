package userInput;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		
		System.out.println("value of a before swap = "+ a);
		System.out.println("value of b before swap = "+ b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println();
		System.out.println("value of a after swap = "+ a);
		System.out.println("value of b after swap = "+ b);
		
		
sc.close();
	}

}
