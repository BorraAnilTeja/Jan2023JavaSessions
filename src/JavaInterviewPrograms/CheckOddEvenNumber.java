package JavaInterviewPrograms;

import java.util.Scanner;

public class CheckOddEvenNumber {

	public static void main(String[] args) {
		int x;


	Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the  number:");
		x=in.nextInt();
		
		if(x%2==0) {
			System.out.println(x+" is Even number");
		}
		else {
			System.out.println(x+" is Odd number");
		}
	}

}
