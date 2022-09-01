package AmazonInterviewPreparation;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][]mat= { {4,6,7},
				      {6,5,8},
				      {9,3,2}};//rotate matrix 90 degree clock wise
		/*//clock wise 90 degree
		 * //transpose
		 *  4 6 9
		 *  6 5 3
		 *  7 8 2
		 *  //reverse
		 *  9 6 4
		 *  3 5 6
		 *  2 8 7
		 *  
		 *  //anticlock wise 90 degree
		 *  //reverse
		 *  7 6 4
		 *  8 5 6
		 *  2 3 9
		 *  //transpose
		 *  7 8 2
		 *  6 5 3
		 *  4 6 9
		 */
		System.out.println("Before rotate matrix..");
		for(int[]a:mat) {
			for(int t:a) {
				System.out.print(t+" ");
			}
			System.out.println();
		}
		System.out.println("After rotate matrix....");
		rotateMatrix(mat);
		for(int[]a:mat) {
			for(int t:a) {
				System.out.print(t+" ");
			}
			System.out.println();
		}
	}
public static void rotateMatrix(int[][]mat) {
	//clock wise
	transposeMatrix(mat);
	reverseMatrix(mat);
	
	
	//anti clock wise
//	reverseMatrix(mat);
//	transposeMatrix(mat);
}
private static void transposeMatrix(int[][] mat) {
	for(int i=0;i<mat.length;i++) {
		for(int j=i;j<mat[i].length;j++) {
			
		int t=mat[i][j];
		mat[i][j]=mat[j][i];
		mat[j][i]=t;
		}
	}
}
private static void reverseMatrix(int[][] mat) {
	for(int[]a:mat) {
		int i=0,j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
}
}
