package JavaInterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {

		int a[]= {1,5,8,3,1,3};
		
//		for(int i =0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println("duplicate found:"+a[i]);
//					break;
//					
//				}
				Set<Integer> set = new HashSet<Integer>();
				
				for(int i=0;i<a.length;i++) {
					
					if(set.contains(a[i])) {
						System.out.println("Duplicate found:"+a[i]);
					}else {
						set.add(a[i]);
					
				
					
				}
			}
		
		}
	}

