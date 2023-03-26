package JavaInterviewPrograms;

import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {

		int n,sum=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number to sum the digits");
		n=in.nextInt();
	
		while(n>0) {
			sum = sum+n%10;
			n=n/10;
		
		}
				System.out.println("Sum of digits :"+sum);
			
			
			}
	
		}


