package algorithm.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static int[] bubbleSort(int[]arr) {
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			boolean sorted=true;
			for(int j=0; j<n-1-i; j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted=false;
				}
			}
			if(sorted)break;
		}
		return arr;
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
        bubbleSort(a);
          for(int b:a) {
        	  System.out.print(b+" ");
          }
		}
	}
}
