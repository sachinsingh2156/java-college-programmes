package Assignment2;

import java.util.Scanner;

public class MaxOccurance {
	 public static void main(String[] args) {  
		 Scanner sc = new Scanner(System.in);
		 System.out.print("\nEnter a string : ");
		 String str = sc.nextLine();  
		 System.out.println("Entered string : "+str);
	     int[] freq = new int[str.length()];  
	     char maxChar = str.charAt(0);  
	     int i, j, max;          
	          
	     //Converts given string into character array  
	     char string[] = str.toCharArray();  
	          
	     //Count each word in given string and store in array freq  
	     for(i = 0; i < string.length; i++) {  
	        freq[i] = 1;  
	        for(j = i+1; j < string.length; j++) {  
	           if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
	        	   freq[i]++;        
	        	   //Set string[j] to 0 to avoid printing visited character  
	                string[j] = '0';  
	            }  
	         }  
	      }  
	          
	        //Determine maximum occurring characters  
	      max = freq[0];  
	      for(i = 0; i <freq.length; i++) {  
	      //If max is less than frequency of a character   
	      //then, store frequency in max and corresponding character in maxChar  
	    	  if(max < freq[i]) {  
	    		  max = freq[i];  
	              maxChar = string[i];  
	            }  
	       }  
	        System.out.println("\nMaximum occurring character is : " + maxChar);  
	     
	}  
}
