package JavaPracticeCode;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int n=in.nextInt();
		
		int sum=0,temp=n,remainder;
		while(n>0) {
			 remainder = n%10;
			n=n/10;
		 	sum=sum+ remainder*remainder*remainder;
		
		}
		System.out.println(sum);
		if(temp==sum) {
		System.out.println("armstrong numver");
		}else {
			System.out.println("not armstrong number");
		}
		
		
	}

}
