package algorithm;
import java.io.*;

public class KadanesAlgorithm {

	static int maxSubarraySum(int[] arr, int n) {
		 int c=arr[0];
	     int ti=arr[0];
      for(int i=1; i<n; i++) {	     
    	  c=max(arr[i],c+arr[i]);
	        ti=max(c,ti);
	        }
	        return ti;	
	}
	static int max(int a, int b) {
//		if(a>b)return a;
//		else return b;
	   return a>b?a:b;
	}
	public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s=br.readLine();
	int n=Integer.parseInt(s);
	int[]a=new int[n];
	String s1=br.readLine();
	String[]s2=s1.trim().split(" ");
	for(int i=0; i<n; i++) {
		a[i]=Integer.parseInt(s2[i]);
	}
	System.out.println(maxSubarraySum(a,n));
	}

}
