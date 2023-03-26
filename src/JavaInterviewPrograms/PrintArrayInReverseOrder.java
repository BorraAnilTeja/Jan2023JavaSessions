package JavaInterviewPrograms;

public class PrintArrayInReverseOrder {

	public static void main(String[] args) {

		int a[]= {-1,9,5,6,8,3};
		
		for(int i =a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}
