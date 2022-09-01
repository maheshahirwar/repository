package DynamicProgramming;
/* Question : Given a number of stairs. 
 * Starting from the 0th stair we need to climb to the “Nth” stair. 
 * At a time we can climb either one or two steps. 
 * We need to return the total number of distinct ways to reach from 0th to Nth stair.
 * for example n=3
 * total ways : (1,1,1), (1,2),(2,1) = 3 ways 
 */

import java.util.*;
public class Climbing_Stair {

	public static void main(String[] args) {
	int n=3;
	
	//recursion 
	
	System.out.println(f(n));
	
	// memoization 
	int[]dp=new int[n+1];
	Arrays.fill(dp,-1);
	System.out.println(f(n,dp));
	
	//tabulation
	int[]d=new int[n+1];
	d[0]=1;
	d[1]=1;
	for(int i=2;i<n+1;i++) {
		d[i]=d[i-1]+d[i-2];
	}
	System.out.println(d[n]);
	
	
	//space optimization
	int prev=1;
	int prev2=1;
	for(int i=2;i<n+1;i++) {
		int cur=prev+prev2;
		prev2=prev;
		prev=cur;
	}
	System.out.println(prev);
	}

	//recursion solution 
	private static int f(int n) {
		if(n==0)return 1;
		if(n==1)return 1;
		return f(n-1)+f(n-2);
	}
	
	//memoization 
	private static int f(int n,int[]dp) {
		if(n==0)return 1;
		if(n==1)return 1;
		if(dp[n]!=-1)return dp[n];
		return dp[n]=f(n-1,dp)+f(n-2,dp);
	}
}
