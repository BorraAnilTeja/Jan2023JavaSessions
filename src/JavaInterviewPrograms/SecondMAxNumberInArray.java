package JavaInterviewPrograms;

import java.util.Arrays;

public class SecondMAxNumberInArray {

	public static void main(String[] args) {

		int a[]= {1,2,4,5,45,10};
		Arrays.sort(a);
		
		System.out.println(a[a.length-2]);
	}

}
