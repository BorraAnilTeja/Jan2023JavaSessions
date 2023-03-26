package JavaInterviewPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int n,count=0,i;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number to check :");
		
		n=in.nextInt();
		
		if(n>1) {
		
		for(i=1;i<=n;i++) {
			
			if(n%i==0) {
				count++;
		}
		}
				if(count==2) {
					System.out.println(n+" is Prime number");
				}
			else {
				System.out.println(n+" is not a prime number");

		}
	}
	else {
		System.out.println("not a prime number");
}
}
}


