package JavaPracticeCode;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int rev=0;
		
		while(n>0) {
			int remainder=n%10;
			rev = rev*10+remainder;
			n=n/10;
		}
		System.out.println("reverse of a number is :"+rev);
	}

}
