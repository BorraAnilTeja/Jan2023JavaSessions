package JavaPracticeCode;

public class ForLoop {

	public static void main(String[] args) {

		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("----------------------------------------------------------------------");
		for(int j=10;j>=1;j--) {
			System.out.println(j);
		}
		System.out.println("----------------------------------------------------------------------");
		
		for(int k=1;k<=100;k++) {
			if(k%2==0) {
				System.out.println(k);
			}
			System.out.println("----------------------------------------------------------------------");
			
			for(int m=1;m<=100;m++) {
			//	if(!(m%2==0)) {
					System.out.println(m);
					m=m+1;
				}
			}
		}

	}


