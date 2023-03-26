package JavaPracticeCode;

public class ReverseStringWithVowelsAtItsPlace {

	public static void main(String[] args) {

		String str ="Anilteja";

		
		char [] charArr=str.toCharArray();
		
		int left=0,right=charArr.length-1;
		
		while(left<right) {
			if(isVowel(charArr[left])){
				left++;
			}else if(isVowel(charArr[right])) {
				right--;
			}
			else {
				char temp=charArr[left];
				charArr[left]=charArr[right];
				charArr[right]=temp;
				left++;
				right--;
			}
		
				
				
			}
		System.out.println("reversed string with vowels at its palce  : "+String.valueOf(charArr));
		}
	private static boolean isVowel(char c) {
		c=Character.toLowerCase(c);
	return	c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ;
	}

}
