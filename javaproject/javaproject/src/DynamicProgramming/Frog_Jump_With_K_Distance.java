package DynamicProgramming;

import java.util.Arrays;

public class Frog_Jump_With_K_Distance {

	public static void main(String[] args) {
		int n=5;
		int k=3;
		int[]height= {10,30,40,50,20};
		
		 // recursion
		 System.out.println("recursion...");
		 System.out.println(f(height,n-1,k));
		 System.out.println(".....................................");
		 
		 //memoization
		 
		 System.out.println("memoization...");
		 int[]dp=new int[n+1];
		 Arrays.fill(dp,-1);
		 System.out.println(f(height,dp,n-1,k));
		 
		 System.out.println(".....................................");
		 System.out.println("Tabulation...");
		 //tabulation
		 
		 int[]d=new int[n];
		 d[0]=0;
		 for(int i=1;i<height.length;i++) {
			 int minstep=Integer.MAX_VALUE;
			 for(int j=1;j<=k;j++) {
				 if(i-j>=0) {
					 minstep=Math.min(minstep, d[i-j]+Math.abs(height[i]-height[i-j]));
				 }
			 }
			 d[i]=minstep;
		 }
		 System.out.println(d[height.length-1]);
		 
		 System.out.println(".....................................");
		 
		 System.out.println("Space Optimization...");
		 
		 // space optimization
		 // space optimization is not required here because in worst case it take O(n) time space 
//		 int prev=0;
//		 int prev1=Integer.MAX_VALUE;
//		 for(int i=1;i<height.length;i++) {
//			 int ans=Integer.MAX_VALUE;
//			 for(int j=1;j<=k;j++) {
//				 if(i-j>=0) {
//					 ans=Math.min(ans, prev+Math.abs(height[i]-height[i-j]));
//				 }
//				 
//			 }
//			 prev=ans;
//		 }
//		 System.out.println(prev);
		}
	private static int f(int[] height, int[] dp,int n,int k) {
		 if(n==0)return 0;
		 if(dp[n]!=-1)return dp[n];
		 int minstep=Integer.MAX_VALUE;
		 for(int j=1;j<=k;j++) {
			 if(n-j>=0) {
				 minstep=Math.min(minstep,f(height,dp,n-j,k)+Math.abs(height[n]-height[n-j]));
			 }
		 }
		
		 return dp[n]=minstep;
		}

		
		// recursion
		private static int f(int[] height,int n,int k) {
			 if(n==0)return 0;
			 int minstep=Integer.MAX_VALUE;
			 for(int j=1;j<=k;j++) {
				 if(n-j>=0) {
					 minstep=Math.min(minstep,f(height,n-j,k)+Math.abs(height[n]-height[n-j]));
				 }
			 }
			
			 return minstep;
		}
}
