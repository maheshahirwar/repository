package matrix;

import java.util.Scanner;

public class MatrixElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n and m : ");
		int n=sc.nextInt();
	
		int m=sc.nextInt();
		int[][]ar=new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Given matrix is : ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
