package array;

import java.util.Scanner;

public class ContainsSpecificValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1, 2, 10, 15, 20, 25, 45, 58, 64, 77, 81, 99};
		
		boolean present=false;
		System.out.print("Enter the value you want to find : ");
		int n = sc.nextInt();
		for(int i =0; i< a.length; i++) {
			if (n == a[i]) {
				present = true;
				break;
			}
		}
		
		if (present)
			System.out.println("The number "+n+" is present in the array.");
		else
			System.out.println("The number "+n+" is not present in the array.");
		
		sc.close();
	}

}
