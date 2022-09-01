package DynamicProgramming;
import java.util.*;
public class Maximum_Sum_with_Non_Adjacent_Element {

	public static void main(String[] args) {
	 int n=2;
	 int[]arr= {4,8};
	 
	 //recursion
	 System.out.println("recursion.....");
	 System.out.println(f(arr,n-1));
	 System.out.println(".............................................");
	 
	 //memoization
	 System.out.println("memoization...");
	 int[]dp=new int[n];
	 Arrays.fill(dp,-1);
	 System.out.println(f(arr,dp,n-1));
	 System.out.println("..............................................");
	 
	 //tabulation
	 System.out.println("Tabulation...");
	 int[]d=new int[n];
	 d[0]=arr[0];
	 for(int i=1;i<n;i++) {
		 int pick=arr[i];
		if(i-2>=0) {
			pick+=d[i-2];
		}
		int notpick=d[i-1];
		d[i]=Math.max(pick, notpick);
	 }
	 System.out.println(d[n-1]);
	 System.out.println("................................................");
	 
	 //space optimization
	 System.out.println("space optimization...");
	 int prev=arr[0];
	 int prev1=0;
	 for(int i=1;i<n;i++) {
		 int pick=arr[i];
		 if(i-2>=0) {
			 pick+=prev1;
		 }
		 int notpick=prev;
		 int curr=Math.max(pick, notpick);
		 prev1=prev;
		 prev=curr;
	 }
	 System.out.println(prev);
	}

	private static int f(int[] arr, int[] dp, int i) {
	 if(i==0)return arr[i];
	 if(i<0)return 0;
	 if(dp[i]!=-1)return dp[i];
	 int pick=arr[i]+f(arr,dp,i-2);
	 int notpick=0+f(arr,dp,i-1);
	 return dp[i]=Math.max(pick, notpick);
	}

	private static int f(int[] arr, int i) {
	  if(i==0)return arr[i];
	  if(i<0)return 0;
	  int pick=arr[i]+f(arr,i-2);
	  int notpick=0+f(arr,i-1);
	  return Math.max(pick, notpick);
	}

}
