package JavaPracticeCode;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		//5*1=5
		//5*2=10
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number :");
		int x=in.nextInt();
		
		
		for(int i=1;i<=10;i++) {
		System.out.println(x +"*"+i+" ="+ (x*i));	
		}
	}

}
