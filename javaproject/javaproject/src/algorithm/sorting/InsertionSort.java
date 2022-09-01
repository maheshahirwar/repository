package algorithm.sorting;

import java.util.Scanner;

public class InsertionSort {

	static int[] insertionSort(int[]a) {
	int n=a.length;
	int temp,j;
	for(int i=1; i<n; i++) {
		temp=a[i];
		j=i;
		while(j>0&&a[j-1]>temp) {
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
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
        insertionSort(a);
          for(int b:a) {
        	  System.out.print(b+" ");
          }
		}
	}	
	

}
