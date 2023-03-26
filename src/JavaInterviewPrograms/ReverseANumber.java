package JavaInterviewPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		int n,rev=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number to reverse");
		n=in.nextInt();
		
		while(n>0) {
			rev=(rev*10)+n%10;
			n=n/10;
			if(n%10==0) {
			
			System.out.println("Reversed number:"+rev);
			
		}
		}
		
		
	}

}
