package JavaPracticeCode;

public class ReverseStringWithSpecialCharsAtitsPlace {
	
	
//	public static void ReverseStringWithSpecialAtitsPlace() {
//		String str="a&bfi*$wF";
//		char[] charArr = str.toCharArray();
//		
//		int left=0,right=charArr.length-1;
//		
//		while(left<right) {
//			
//			if(!Character.isAlphabetic(charArr[left])) {
//				left++;
//			}
//			else if(!Character.isAlphabetic(charArr[right])) {
//				right++;
//				
//			}
//			else {
//				char temp=charArr[left];
//				charArr[left]=charArr[right];
//				charArr[right]=temp;
//				left++;
//				right--;
//			}
//		}
//		
//		
//	}

	public static void main(String[] args) {

		String str="a&bfi*$wF";
		char[] charArr = str.toCharArray();
		
		int left=0,right=charArr.length-1;
		
		while(left<right) {
			
			if(!Character.isAlphabetic(charArr[left])) {
				left++;
			}
			else if(!Character.isAlphabetic(charArr[right])) {
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
		System.out.println("reversed String :"+String.valueOf(charArr));
		
		
	}

}
