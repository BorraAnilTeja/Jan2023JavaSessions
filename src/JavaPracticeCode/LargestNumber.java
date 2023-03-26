package JavaPracticeCode;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		int a,b,c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number");
		a=in.nextInt();
		System.out.println("Enter second number");
		b=in.nextInt();
		System.out.println("Enter third number");
		c=in.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+"is largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+"is largets number");
		}
		else if(c>a && c>b){
			System.out.println(c+"is largest number");
		}
		else {
			System.out.println("please pass the right integer");
		}
	}

}
