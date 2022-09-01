package algorithm.sorting;
import java.util.*;
public class MergeSort {
	
	public static void main(String[] args) {
	int []ar= {2,4,1,3,5};
	MergeSort ms=new MergeSort();
	ms.sort(ar);
//	for(int d:ar) {
//		System.out.print(d+" ");
//	}
}
	public void sort(int []a) {
		int n=a.length;
		int count=divideArr(a,0,n-1);
		System.out.println(count);
	}
	public int divideArr(int []a,int low, int high) {
		int count=0; 
		if(low<high) {
			 int mid =low+(high-low)/2;
			count+= divideArr(a,low,mid);
			count+= divideArr(a,mid+1,high); 
			count+= mergeArr(a,low,mid,high);
		 }
		return count;
	}
		 public int mergeArr(int []a, int low,int mid, int high) {
			 
			int n1=mid-low+1;
			int n2=high-mid;
			int[]L=Arrays.copyOfRange(a, low, mid + 1);
			int[]R=Arrays.copyOfRange(a, mid+1, high + 1);
			for(int i=0; i<n1; i++) {
				L[i]=a[low+i];
			}
			for(int j=0; j<n2; j++) {
				R[j]=a[mid+1+j];
			}
			int i=0; int j=0;
			int k=low;
			int count=0;
			while(i<n1&&j<n2) {
				if(L[i]<=R[j]) {
					a[k]=L[i];
					i++;
				}else {
					a[k]=R[j];
					j++;
					count+=(mid+1)-(low+i);
				}
				k++;
			}
			while(i<n1) {
				a[k]=L[i];
				i++;
				k++;
			}
			while(j<n2) {
				a[k]=R[j];
				j++;
				k++;
			}
			return count;
	}
	
}
