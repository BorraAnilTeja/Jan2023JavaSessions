package JavaPracticeCode;

public class MaxAndMinNumberInArray {

	public static void main(String[] args) {

		int a[]= {2,4,9,6,7,3,8};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println("max number is :"+max);
		System.out.println("max number is :"+min);

	}

}
