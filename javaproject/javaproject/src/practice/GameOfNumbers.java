package practice;

import java.util.Scanner;

public class GameOfNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
          int i,j,k;
      for(i=0; i<n; i++) {
    	  a[i]=sc.nextInt();
      }
      for(i=0; i<n; i++) {
    	  for(j=i+1; j<n; j++) {
    		  if(a[i]<a[j])
    			 break;
    	  }
    	  if(j!=n) {
    		  for(k=j+1; k<n; k++) {
    			  if(a[j]>a[k])
    				  break;
    		  }
    		  if(k!=n) {
    			  System.out.print(a[k]+" ");
    		  }else
    			  System.out.print("-1 ");
    	  }else {
    		  System.out.print("-1 ");
    	  }
      }
		
	}
}
