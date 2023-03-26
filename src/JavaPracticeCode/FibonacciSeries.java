package JavaPracticeCode;

public class FibonacciSeries {

	public static void main(String[] args) {

		//0 1 1 2  3 5 8 13 21 34 55
		
		
		int n1=0,n2=1,sum=0,i;
		System.out.print(n1+" "+n2+" ");
		
		for(i=2;i<=10;i++) {
			
			sum=n1+n2;
			System.out.print(sum + "  ");
			n1=n2;
			n2=sum;
		}
		
	}

}
