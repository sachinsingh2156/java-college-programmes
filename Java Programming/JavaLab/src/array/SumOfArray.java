package array;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of array");
		int a[]= new int [n];
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
//		int a[] = {1, 10, 20, 3, 40, 5};
		int sum = 0;
		
//		For each loop
		for (int j : a) {
			sum += j;		
		}
		sc.close();
		System.out.println("Sum = "+sum);

	}
}
