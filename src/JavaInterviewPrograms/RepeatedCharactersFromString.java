package JavaInterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class RepeatedCharactersFromString {

	public static void main(String[] args) {

		String str ="Iam Aniltej";
		
		int len = str.length();
		System.out.println(len);
		
		char string[]  = str.toCharArray();		
		Set<Character> repeatedchars = new HashSet<>();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				
				if(string[i]==string[j]&&string[i]!=' ') {
					
					repeatedchars.add(string[i]);
					break;
				}
				
					
				}
			}
		System.out.println("Repeated characters:"+repeatedchars.toString());
		}
	}


