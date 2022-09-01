package matrix;

import java.util.Scanner;

public class Determinant {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number : ");
	int n=sc.nextInt();
	int[][]mat=new int[n][n];
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			mat[i][j]=sc.nextInt();
		}
	}
	System.out.println("Given matrix is : ");
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
	}
	    int i=0;
    	 int j=0;
	int determinant=mat[i][j]*(mat[i+2][j+2]*mat[i+1][j+1]-mat[i+2][j+1]*mat[i+1][j+2])-mat[i][j+1]*(mat[i+1][j]*mat[i+2][j+2]-mat[i+2][j]*mat[i+1][j+2])+mat[i][j+2]*(mat[i+1][j]*mat[i+2][j+1]-mat[i+2][j]*mat[i+1][j+1]);
	System.out.println("Determinant is "+determinant);
	}

}
