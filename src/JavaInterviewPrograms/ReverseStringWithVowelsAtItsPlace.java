package JavaInterviewPrograms;

public class ReverseStringWithVowelsAtItsPlace {

	public static void main(String[] args) {

		String str = "Anilteja";
		String output = "";
		
		String vowels ="aeiouAEIOU";
		int [] vowelIndices =new int[str.length()];
		
		int vowelCount =0;
		 for(int i=0;i<str.length();i++) {
			 if(vowels.indexOf(str.charAt(i))!=-1) {
				 vowelIndices[vowelCount++]=i;
			 }
		 }
		 for(int i=0;i<str.length();i++) {
			 if(vowels.indexOf(str.charAt(i))!=-1) {
				 output+=str.charAt(vowelIndices[--vowelCount]);
			 }
			 else {
				 output+=str.charAt(i);
			 }
		 }
		 System.out.println(output);
	}

}
