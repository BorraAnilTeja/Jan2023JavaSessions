package JavaPracticeCode;

import java.util.Scanner;

public class StringIsPalindrome {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=in.next();
		int len = str.length();
		String rev="";
		String original=str;
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(rev.equals(original)) {
			System.out.println(rev+" is  a palindrome");
		}else {
			System.out.println(rev+" is not a palindrome");
		}
	}

}
