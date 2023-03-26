package JavaInterviewProgramPractice;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int n=in.nextInt();
		
		int sum=0,remainder ;
		int temp =n;
		
		while(n>0) {
			remainder =n%10;
			n=n/10;
			sum= sum+remainder*remainder*remainder;
			
			
		}
		if(temp==sum) {
			System.out.println(temp+" is armstrong number");
		}
		else {
			System.out.println(temp+" is not a armstrong number");
		}
		
	}

}
