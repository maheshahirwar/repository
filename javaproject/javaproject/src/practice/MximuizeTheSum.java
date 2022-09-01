package practice;

import java.util.*;

public class MximuizeTheSum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	
  while(t-->0) {
	  int n=sc.nextInt();
	  int k=sc.nextInt();  
	  int[]a=new int[n];
	  for(int i=0; i<n; i++) {
		  a[i]=sc.nextInt();
	  }
	  Arrays.sort(a);
	  int count=0;
	  int sum=0;
	  for(int i=n-1; i>0;i--) {
		  if(a[i]!=a[i-1]) {
		  count++;
		  }
		  sum+=a[i];
		  if(count==k)break;
	  }
	  System.out.println(sum);
  }
	}

}
