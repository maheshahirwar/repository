package Arrays.algorithm.sortingAlgorithm;

import java.util.Scanner;

public class BubbleSortAlgorithm {
	
	static void arraySort(int []ar) {
		int l=ar.length;
		for(int i=0; i<l-1; i++) {
			boolean sorted=true; 
			
			for(int j=0; j<l-1-i; j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					sorted=false;
		    		}
		    	}
			if(sorted)break;
		  }
			for(int item:ar) 
				System.out.print(item+" ");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		arraySort(a);
	}

}
