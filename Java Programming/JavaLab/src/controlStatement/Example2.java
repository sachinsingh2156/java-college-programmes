package controlStatement;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number : "); int n = sc.nextInt(); 
		sc.close();
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("The sum of first "+n+" natural number is "+ sum);
	}

	
}
