package JavaInterviewPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int x,y,z;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		x=in.nextInt();
		System.out.println("Enter the second number :");
		y=in.nextInt();
		
		//first logic
//	
//		z=x; //89
//		x=y;//70
//		y=z;
		
		//second logic
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		//third logic
		
		
		
		System.out.println("After swapping the two number x:"+x+"y:"+y);
	}

}
