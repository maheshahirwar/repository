package practice;
import java.io.*;
import java.util.*;

public class MinimizeHeight {

	public static int minimumHeight(int[]a, int n, int k) {
		Arrays.sort(a);
		int ans = a[n-1]-a[0];
		int first= a[0]+k;
		int last=a[n-1]-k;
		int min,max;
		for(int i=1; i<n; i++) {
			min=Math.min(first, a[i]-k);
			max=Math.max(last, a[i-1]+k);
			ans=Math.min(ans, max-min);
		}
		return ans;
	}
	
	public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	String[]sr=s.trim().split(" ");
	int k=Integer.parseInt(sr[0]);
	int n=Integer.parseInt(sr[1]);
	int []a=new int[n];
	String s1=br.readLine();
	String []sr1=s1.trim().split(" ");
	for(int i=0; i<n; i++) {
		a[i]=Integer.parseInt(sr1[i]);
	}
	System.out.println(minimumHeight(a,n,k));
	}
}
