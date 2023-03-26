package JavaInterviewProgramPractice;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		int F,C;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temperature");
		F=in.nextInt();
		
		C=(F-32)*5/9;
		
		System.out.println(C);
	}

}
