package JavaPracticeCode;

public class PrintArrayInReverseOrder {

	public static void main(String[] args) {

		int a[]= {2,3,-1,9,4,5};
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}
