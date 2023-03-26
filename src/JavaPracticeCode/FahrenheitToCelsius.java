package JavaPracticeCode;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter fahreheit temp:");
		
		int F=in.nextInt();
		
		double C=(F-32)*5/9;
		
		System.out.println(C);
	}

}
