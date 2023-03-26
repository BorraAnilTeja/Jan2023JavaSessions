package JavaInterviewPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int n = in.nextInt();

		int sum=0,r;
		
		int temp=n;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("its a armstrong number");
		}
		else {
			System.out.println("its not a armstrong number");
		}
	}

}
