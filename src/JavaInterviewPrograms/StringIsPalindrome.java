package JavaInterviewPrograms;

import java.util.Scanner;

public class StringIsPalindrome {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str =in.next();
		
		String originalString =str;
		
		String rev ="";
		int len = str.length();
		
		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(rev.equals(originalString)) {
			System.out.println("Entered string is palindrome");
		}
		else {
			System.out.println("Enetered string is not palindrome");
			
		}
	}

}
