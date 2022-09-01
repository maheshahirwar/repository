package algorithm.sorting;

import java.util.Scanner;

public class SelectionSort {
 
	static int[]  selectionSort(int[]a) {
	int n=a.length;
	 for(int i=0; i<n-1; i++) {
		 int minInd=i;
		 for(int j=i; j<n; j++) {
			 if(a[j]<a[minInd]) {
				 minInd=j;
			 }
		 }
		 int temp=a[i];
		 a[i]=a[minInd];
		 a[minInd]=temp;
	 }
	return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
        selectionSort(a);
          for(int b:a) {
        	  System.out.print(b+" ");
          }
		}
	}
	}


