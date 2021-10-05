package userInput;
import java.util.Scanner;

public class NameInput {
	public static void main(String[] args) {
		System.out.println("Enter your name : ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Hello "+ name +"!");
	input.close();
	}
}
