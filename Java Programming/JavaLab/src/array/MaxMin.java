package array;

import java.util.Scanner;

public class MaxMin {
	public static int getMaxValue(int[] numbers){
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
		      maxValue = numbers[i];
		    }
		  }
		  return maxValue;
		}
	public static int getMinValue(int[] numbers){
		  int minValue = numbers[0];
		  for(int i=1;i<numbers.length;i++){
		    if(numbers[i] < minValue){
		      minValue = numbers[i];
		    }
		  }
		  return minValue;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : "); int n = sc.nextInt();
		int a[]= new int [n];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		 int max = getMaxValue(a);
		 int min = getMinValue(a);
		System.out.println("The maximum value in the array = "+ max);
		System.out.println("The minimum value in the array = "+ min);
		
	sc.close();
	}

}
