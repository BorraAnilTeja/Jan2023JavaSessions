package JavaInterviewPrograms;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {

		int m,n,i,j;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of rows and columns:");
		
		m=in.nextInt();
		n=in.nextInt();
		
		int firstMatrix [][]= new int[m][n];
		int secondMatrix [][]= new int[m][n];
		int sum[][]=new int[m][n];
		
		System.out.println("Enter the elements of first matrix");
		
		for( i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				firstMatrix[i][j]=in.nextInt();
			}
		}
			
			
		
		System.out.println("Enterthe elements of second matrix");
		
		for( i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				secondMatrix[i][j]=in.nextInt();
			}
		}
			
		
		for( i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
	}

}
		for( i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(sum[i][j]+"\t");
				
			}
			System.out.println();
	}
			}
		}