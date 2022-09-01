package Arrays.algorithm.sortingAlgorithm;

import java.util.Scanner;

public class SelectionSort {
	
	static void arraySort(int[]ar) {
		int l=ar.length;
		for(int i=0; i<l-1; i++) {
			int minInd=i;
			for(int j=i; j<l; j++) {
				if(ar[j]<ar[minInd]) {
					minInd=j;
				}
			}
			int temp=ar[i];
			ar[i]=ar[minInd];
			ar[minInd]=temp;
		}
		for(int it:ar) {
			System.out.print(it+" ");
		}
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
