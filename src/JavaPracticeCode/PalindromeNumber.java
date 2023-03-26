package JavaPracticeCode;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		//1661
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
	   int 	n=in.nextInt();
	   int rev=0,remainder;
	   int original=n;
	    
	   
	   while(n>0) {
		   remainder =n%10;
		   
		   rev= (rev*10)+remainder;
		   n=n/10;//166
		   
	   }
	   if(rev==original) {
	   System.out.println(original + "   is a palindrome");
	   }else {
		   System.out.println(original + "  is not a palindrome");
	   }
	   
	   
	}

}
