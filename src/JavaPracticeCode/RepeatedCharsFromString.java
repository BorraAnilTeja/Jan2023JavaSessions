package JavaPracticeCode;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharsFromString {

	public static void main(String[] args) {

		String str="aabcdeff b  c";
		
		char [] charArr = str.toLowerCase().toCharArray();
		
		
		Set<Character> repeatedChars = new HashSet<>();
		
		for(int i=0;i<charArr.length;i++) {
			for(int j=i+1;j<charArr.length;j++) {
				if(charArr[i]==charArr[j] &&charArr[i] !=' ') {
					
					repeatedChars.add(charArr[i]);
					
					
				}
			}
		}
		System.out.println("repeated chars:"+repeatedChars);
		
		
		
		
		
	}

}
