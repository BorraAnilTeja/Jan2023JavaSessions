package JavaInterviewPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n,reverse=0,remainder;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse :");
		
		n=in.nextInt(); //1234
		
		while(n!=0) {
			remainder = n%10; //4
			reverse= reverse*10+remainder;
			n=n/10;//123
			
		}
		System.out.println("Reversed number is :"+reverse);


		
	}

}
