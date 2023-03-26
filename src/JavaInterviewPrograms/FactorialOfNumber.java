package JavaInterviewPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		int i,x,fact =1;
		
Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the  number:");
		x=in.nextInt();
		
		for(i=1;i<=x;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of given number is :"+fact);
	}

}
