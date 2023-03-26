package JavaPracticeCode;

import java.util.Scanner;

public class FactorilaOfNumber {

	public static void main(String[] args) {

		int i,fact=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int n = in.nextInt();
		
		
		for( i=1;i<=n;i++) {
			 fact=fact*i;
		
		
			
		}
		System.out.println("Factorial of given number:  "+fact);
	}

}
