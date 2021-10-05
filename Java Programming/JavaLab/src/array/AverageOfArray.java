package array;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements of array");
		int a[]= new int [n];
		for (int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		float sum = 0;
		for(int j=0; j<n; j++) { 
			sum += a[j];
		}
		float average = sum/n;
		sc.close();
		System.out.println("Average = " + average);
	}

}
