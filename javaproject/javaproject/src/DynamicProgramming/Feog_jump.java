package DynamicProgramming;
import java.util.*;
public class Feog_jump {

	public static void main(String[] args) {
	 int[]height= {10,20,30,10};
	 
	 // recursion
	 System.out.println("recursion...");
	 System.out.println(f(height,height.length-1));
	 System.out.println(".....................................");
	 
	 //memoization
	 
	 System.out.println("memoization...");
	 int[]dp=new int[height.length+1];
	 Arrays.fill(dp,-1);
	 System.out.println(f(height,dp,height.length-1));
	 
	 System.out.println(".....................................");
	 System.out.println("Tabulation...");
	 //tabulation
	 
	 int[]d=new int[height.length];
	 d[0]=0;
	 for(int i=1;i<height.length;i++) {
		int left=d[i-1]+Math.abs(height[i]-height[i-1]);
		int right=Integer.MAX_VALUE;
		if(i>1) {
		right=d[i-2]+Math.abs(height[i]-height[i-2]);
		}
		d[i]=Math.min(left, right);
	 }
	 System.out.println(d[height.length-1]);
	 
	 System.out.println(".....................................");
	 
	 System.out.println("Space Optimization...");
	 
	 // space optimization
	 
	 int prev=0;
	 int prev1=Integer.MAX_VALUE;
	 for(int i=1;i<height.length;i++) {
		 int left=prev+Math.abs(height[i]-height[i-1]);
		 int right=Integer.MAX_VALUE;
		 if(i>1) {
			 right=prev1+Math.abs(height[i]-height[i-2]);
		 }
		int ans=Math.min(left, right);
		prev1=prev;
		prev=ans;
	 }
	 System.out.println(prev);
	}

	
	
	// memoization
	private static int f(int[] height, int[] dp,int n) {
	 if(n==0)return 0;
	 if(dp[n]!=-1)return dp[n];
	 int left=f(height,dp,n-1)+Math.abs(height[n]-height[n-1]);
	 int right=Integer.MAX_VALUE;
	 if(n>1) {
	  right=f(height,dp,n-2)+Math.abs(height[n]-height[n-2]);
	 }
	 return dp[n]=Math.min(left, right);
	}

	
	// recursion
	private static int f(int[] height,int n) {
	 if(n==0)return 0;
	 int left=f(height,n-1)+Math.abs(height[n]-height[n-1]);
	 int right=Integer.MAX_VALUE;
	 if(n>1) {
	  right=f(height,n-2)+Math.abs(height[n]-height[n-2]);
	 }
	 return Math.min(left, right);
	}

}
