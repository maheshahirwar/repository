package AmazonInterviewPreparation;
/*
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and 
    column are set to 0.
 */
public class SetZeroMatrix {

	public static void main(String[] args) {
     int[][]mat= {{2,4,0,3},
    		      {1,4,2,5},
    		      {0,6,3,2},
    		      {4,6,8,7}};	// set zero all col and row if any ele has zero in row and col
     setZero(mat);
    for(int[]a:mat) {
    	for(int t:a) {
    		System.out.print(t+" ");
    	}
    	System.out.println();
    }
	}
public static void setZero(int[][]mat) {
	boolean forrow=false;
	boolean forcol=false;
	for(int i=0;i<mat.length;i++) {
		if(mat[i][0]==0)forrow=true;
	}
	for(int j=0;j<mat[0].length;j++) {
		if(mat[0][j]==0)forcol=true;
	}
	for(int i=1;i<mat.length;i++) {
		for(int j=1;j<mat[i].length;j++) {
			if(mat[i][j]==0) {
				mat[i][0]=0;
				mat[0][j]=0;
			}
		}
	}
	for(int i=0;i<mat.length;i++) {
		if(mat[0][i]==0)setZeroRow(mat,i);
	}
	for(int j=0;j<mat[0].length;j++) {
		if(mat[j][0]==0)setZeroCol(mat,j);
	}
	if(forrow)setZeroRow(mat,0);
	if(forcol)setZeroCol(mat,0);
}
private static void setZeroRow(int[][] mat, int row) {
	for(int i=0;i<mat.length;i++) {
		mat[row][i]=0;
	}
}
private static void setZeroCol(int[][] mat, int col) {
	for(int i=0;i<mat.length;i++) {
		mat[i][col]=0;
	}
}

}
