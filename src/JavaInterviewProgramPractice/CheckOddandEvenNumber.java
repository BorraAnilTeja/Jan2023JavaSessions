package JavaInterviewProgramPractice;

import java.util.Scanner;

public class CheckOddandEvenNumber {
	
	

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		int n = in.nextInt();
		
		 isOddOrEven( n);
		
		
		
	}
	public static void  isOddOrEven(int n) {
		
		 if(n>0) {
		 
		  if(n%2==0) {
				 System.out.println(n+" is Evn number");
			 }
			 else {
				 System.out.println(n+" is odd number");
			 }
			 
			
		 }
	
}
}


