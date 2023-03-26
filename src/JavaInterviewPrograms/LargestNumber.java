package JavaInterviewPrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		int a,b,c;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		a=in.nextInt();
		System.out.println("Enter the second  number:");
		b=in.nextInt();
		System.out.println("Enter the third number:");
		c=in.nextInt();
		
		if(a>b  && a>c) {
			System.out.println("Largest number is :"+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest number is :"+b);
		}
		else if (c>a && c>b) {
			System.out.println("Largest number is :"+b);
		}
		else {
			System.out.println("please pass the right integer");
		}
		
	}

}
