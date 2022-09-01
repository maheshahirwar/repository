package matrix;

import java.util.Scanner;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n and m : ");
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[][]matrixA=new int[n][m];
	int[][]matrixB=new int[n][m];
	int[][]matrixC=new int[n][m];
	System.out.println("Enter Matrix A : ");
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			matrixA[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter Matrix B : ");
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			matrixB[i][j]=sc.nextInt();
		}
	}
	System.out.println("Sum of two matrix is : ");
	for(int i=0; i<n; i++) {
		for(int j=0; j<m; j++) {
			matrixC[i][j]=matrixA[i][j]+matrixB[i][j];
		}
	}
	for(int i=0; i<n; i++){
		for(int j=0; j<m; j++){
	      System.out.print(matrixC[i][j]+" ");		
		}
		System.out.println();
	}
	}

}
