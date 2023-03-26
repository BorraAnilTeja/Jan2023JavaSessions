package JavaPracticeCode;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArray {

	public static void main(String[] args) {

	  int a[]= {8,4,8,5,4,6,9,1,1,3,6,9,5};
	  
//	  for(int i=0;i<a.length;i++) {
//		  for(int j=i+1;j<a.length;j++) {
//			  
//			  if(a[i]==a[j]) {
//				  System.out.println(a[i]);
//			  }
//		  }
//	  }
	  
	  Set<Integer> set = new HashSet<>();
	  

for(int i=0;i<a.length;i++) {
	if(set.contains(a[i])) {
		  System.out.println("duplicate found :"+a[i]);
	}else {
		set.add(a[i]);
	}
		  
	  }
	}

}
