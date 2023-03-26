package JavaInterviewPrograms;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {


		String S1,S2;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first string:");
		
		S1=in.nextLine();

		System.out.println("Enter the Second string:");
		
		S2=in.nextLine();
		
		if(S1.compareTo(S2)>0){
			System.out.println("First String is greater than second");
		}
		else if (S1.compareTo(S2)<0) {
			System.out.println("First  String is smaller than second");
		}
			else {
				System.out.println("Both are equal");
				
			}

		}
	}


