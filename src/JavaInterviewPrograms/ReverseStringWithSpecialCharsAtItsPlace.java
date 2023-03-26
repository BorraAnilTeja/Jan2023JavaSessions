package JavaInterviewPrograms;

public class ReverseStringWithSpecialCharsAtItsPlace {
	
	
	public static String reverse(String str) {
	
		//first convert the string to char array so that we can manipulate easily	
		
		char[] charArr=str.toCharArray();
		
		//intiiate the pointer form left and right
		
		int left=0,right=charArr.length-1;
		
		 // Iterate through the string with the two pointers until they meet in the middle
		
		while(left<right) {
	        // Check if the character at the left pointer is not an alphabetic character
          
			if(!Character.isAlphabetic(charArr[left])) {
                 
            	  // If it's not, move the left pointer inwards and continue to the next iteration

            	  left++;
            	  
                  // Check if the character at the right pointer is not an alphabetic character

              }  else if (!Character.isAlphabetic(charArr[right])) {
            	  
                  // If it's not, move the right pointer inwards and continue to the next iteration

            		  right--;
            	  }
              else {
            	// If both characters at the left and right pointers are alphabetic,
                  // swap them and move both pointers inwards
            	  
            	  char temp=charArr[left];
            	  charArr[left]=charArr[right];
            	  charArr[right]=temp;
            	  left++;
            	  right--;
              }
		}
		return new String(charArr);
		
		
	}

	public static void main(String[] args) {

		String str="a!,y$&gL?";
		String rev = reverse(str);
		
		System.out.println(rev);
	}

}
