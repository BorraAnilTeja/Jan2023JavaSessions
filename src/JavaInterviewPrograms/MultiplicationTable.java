package JavaInterviewPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		int x,n,y,z;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the multiplication table of a number :");
		
		x=in.nextInt();
		System.out.println("Enter the range  of multiplication table of a number :");
		z=in.nextInt();
		
		
		for(n=1;n<=z;n++) {
			System.out.println((x+"*"+n)+"="+(x*n));
		}
		
		
	}

}
