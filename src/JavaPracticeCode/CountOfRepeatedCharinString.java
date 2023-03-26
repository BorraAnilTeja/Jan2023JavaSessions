package JavaPracticeCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountOfRepeatedCharinString {

	public static void main(String[] args) {


		String str="Iam Aniltej";
		
		char [] charArr =str.toLowerCase().toCharArray();
		

		Map<Character,Integer> charCount =new HashMap<>();
		
		Set<Character> repeatedChars=new HashSet<>();
		
		for(char ch: charArr) {
			
			if(ch!=' '){
			int 	count =charCount.getOrDefault(ch, 0)+1;
			
			charCount.put(ch,count);
			if(count>1) {
				repeatedChars.add(ch);
			}
		
				
				
			}
				
			}
		if(repeatedChars.size()==0) {
			System.out.println("no reppeated chars");
		}
		else {
	
		for(char ch:repeatedChars) {
	
		
		System.out.println(ch+":"+charCount.get(ch));
		
		}
		
		}
	
		
	
			
		
			
			
		
				
			}
		}
	


