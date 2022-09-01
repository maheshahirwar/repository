package algorithm.recursion;

public class FloodFillMatrix {

	public static void main(String[] args) {
		int ar[][]= {{1,1,1,2,1,1,1,1},
				     {1,2,2,2,2,0,0,1},
				     {1,1,2,2,1,0,2,1},
				     {1,1,1,2,1,0,0,1}
				     };
		floodFill(ar,0,0,3,1);
		printMatrix(ar);
	}
  static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
	  int rows=a.length;
	  int cols=a[0].length;
	  if(r<0||r>=rows||c<0||c>=cols) {
		  return;
	  }
	  if(a[r][c]!=prevFill) {
		  return;
	  }
	  a[r][c]=toFill;
	  floodFill(a,r-1,c,toFill,prevFill);
	  floodFill(a,r,c-1,toFill,prevFill);
	  floodFill(a,r+1,c,toFill,prevFill);
	  floodFill(a,r,c+1,toFill,prevFill);
  }
 static void printMatrix(int a[][]) {
	 int n=a.length;
	 int m=a[0].length;
	 for(int i=0; i<n; i++) {
		  for(int j=0; j<m; j++) {
			  System.out.print(a[i][j]+" ");
		  }
		  System.out.println();
	  }
  }
}
