package JavaInterviewProgramPractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {

		int a[]= {3,2,5,7,3,9,2,7};
		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<a.length;i++) {
			
			if(set.contains(a[i])) {
				System.out.println("Duplicate found"+a[i]);
			}else {
				set.add(a[i]);
		
			}
		}
	}

}
