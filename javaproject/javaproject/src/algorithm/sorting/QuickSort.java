package algorithm.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[]ar= {43,76,89,64,2,2422,12,443,23,55,772,112,56,377,8444,66};
		QuickSort qs=new QuickSort();
		qs.quicksortRecursion(ar,0,ar.length-1);
		for(int a:ar) {
			System.out.print(a+" ");
		}
	}

	public int partition(int []a, int low, int high) {
		int pivot= a[(low+high)/2];
		int i=low;
		int j=high;
		while(i<=j) {
			while(a[i]<pivot) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			  if(i<=j) {
			     swap(a,i,j);
			  i++;
			  j--;
		}
		}
		return i;
	}
	void swap(int[]a, int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public void quicksortRecursion(int[]a, int low, int high) {
		int pi=partition(a,low,high);
		if(low<pi-1) {
			quicksortRecursion(a,low,pi-1);
		}
		if(pi<high) {
			quicksortRecursion(a,pi,high);
		}
	}
}
