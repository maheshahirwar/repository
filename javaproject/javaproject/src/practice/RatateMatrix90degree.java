package practice;

/*
 *   1  2  3                   7  4  1
 *   4  5  6     ----->        8  5  2
 *   7  8  9                   9  6  3
 */
public class RatateMatrix90degree {

	public static void main(String[] args) {
		int[][]matrix= {{1,2,3},
				        {4,5,6},
				        {7,8,9} };
		matrix=rotateMatrix(matrix);
    for(int i=0; i<matrix.length;i++) {
    	for(int j=0;j<matrix[0].length;j++) {
    		System.out.print(matrix[i][j]+" ");
    	}
    	System.out.println();
    }
	}
static int[][] rotateMatrix(int[][]mat){
	int n=mat.length;
	int m=mat[0].length;
	for(int i=0; i<n/2; i++) {
		for(int j=i; j<n-i-1;j++) {
			int temp=mat[i][j];
			mat[i][j]=mat[n-1-j][i];
			mat[n-1-j][i]=mat[n-1-i][n-1-j];
			mat[n-1-i][n-1-j]=mat[j][n-1-i];
			mat[j][n-1-i]=temp;
		}
	}
	return mat;
}
}
