package JavaInterviewPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		int n,rev=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		n=in.nextInt();  
		int original =n;
		
		while(n!=0) {
			
			rev=( rev * 10)+n%10;
			
	         	n=n/10;
			
			
		}
		System.out.println(rev);
		   if(rev==original) {
			System.out.println(original+" is a Palindrome number ");
		}else {
			System.out.println(original+" is not a palindrome number");
		}
		
	}

}
