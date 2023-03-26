package JavaPracticeCode;

import java.util.Arrays;

public class SecondMaxNumberInArray {

	public static void main(String[] args) {

		int a[]= {2,3,7,6,8,4};
		Arrays.sort(a);
		
		System.out.println(a[a.length-2]);
	}

}
