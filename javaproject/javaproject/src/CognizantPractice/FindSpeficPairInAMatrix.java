package CognizantPractice;

public class FindSpeficPairInAMatrix {

	public static void main(String[] args) {
		int [][]mat={
	              { 1, 2, -1, -4, -20},
	              {-8, -3, 4, 2, 1},
	              {3, 8, 6, 1, 3 },
	              {-4, -1, 1, 7, -6 },
	              {0, -4, 10, -5, 1}
	                   };
		System.out.println(findSpefic(mat));
	}
static int findSpefic(int[][]mat) {
	int maxValue=Integer.MIN_VALUE;
	int n=mat.length;
	int m=mat[0].length;
	
	int[][]dp=new int[n][m];
	dp[n-1][m-1]=mat[n-1][m-1];
	// last row 
	for(int i=n-2;i>=0;i--) {
		dp[n-1][i]=Math.max(dp[n-1][i+1], mat[n-1][i]);
	}
	// last columm
	for(int i=n-2;i>=0;i--) {
		dp[i][n-1]=Math.max(dp[i+1][n-1], mat[i][n-1]);
	}
	// rest matrix
	for(int i=n-2;i>=0;i--) {
		for(int j=n-2;j>=0;j--) {
			maxValue=Math.max(maxValue, dp[i+1][j+1]-mat[i][j]);
			dp[i][j]=Math.max(dp[i+1][j+1], Math.max(dp[i][j+1], dp[i+1][j]));
			
		}
	}
	return maxValue;
}
}
