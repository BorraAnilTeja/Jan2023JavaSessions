package JavaInterviewProgramPractice;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter rows and columns");
		
		int m=in.nextInt();
		int n=in.nextInt();
		
		int firstMatrix[][] = new int[m][n];
		int secondMatrix[][] = new int[m][n];
		int sum[][]= new int[m][n];
		
		System.out.println("Enter the elements of fitst matrix");
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				firstMatrix[i][j]=in.nextInt();
				
			}
		}
	System.out.println("Enter the elements of second matrix");
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				secondMatrix[i][j]=in.nextInt();
				
			}
		}
	
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
			sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
				
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
		System.out.println(sum[i][j] +"\t");
	}
		}
	}

}
