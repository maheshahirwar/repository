package DynamicProgramming;
import java.util.*;
public class Fibonacci_Number {

	public static void main(String[] args) {
	int n=5;
	//recursion 
	System.out.println(f(n));
	
	
	//memoization
	int[]dp=new int[n+1];
	Arrays.fill(dp,-1);
	System.out.println(f(n,dp));
	
	// tabilation 
	
	int[]d=new int[n+1];
	d[0]=0;
	d[1]=1;
	for(int i=2;i<n+1;i++) {
		d[i]=d[i-1]+d[i-2];
	}
	System.out.println(d[n]);
	
	//space optimization
	
	int prev=1;
	int prev2=0;
	for(int i=2;i<n+1;i++) {
		int cur=prev+prev2;
		prev2=prev;
		prev=cur;
	}
	System.out.println(prev);
	
	}
	
	// recursion solution 

private static int f(int n) {
	if(n<=1)return n;
	return f(n-1)+f(n-2);
}
	// memoization solution 
private static int f(int n,int[]dp) {
	if(n<=1)return n;
	if(dp[n]!=-1)return dp[n];
	return dp[n]=f(n-1,dp)+f(n-2,dp);
}
}
