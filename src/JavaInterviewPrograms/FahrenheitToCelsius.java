package JavaInterviewPrograms;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		int c,f;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the fahrenheit temp :");
		
		f=in.nextInt();

		c=(f-32)*5/9;
		
		System.out.println("Celsium temp after conversion :"+c);
		
	}

}
