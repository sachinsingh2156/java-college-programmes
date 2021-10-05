package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : "); int n = sc.nextInt();
		int a[]= new int [n];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("The original array = {");
		for (int i = 0; i < n; i++) {  
            System.out.print(a[i] + ", ");  
        }  
		System.out.println("}");
		System.out.print("The array in reverse order = {");
		 for (int i = n-1; i >= 0; i--) {  
	            System.out.print(a[i] + ", ");  
	        }
		 System.out.println("}");
	sc.close();
	}

}
