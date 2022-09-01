package algorithm.sorting;

public class HeapSort {

	public static void main(String[] args) {
		int[]arr= {4,1,3,9,7};
		int n=arr.length;
        heapSort(arr,n);
        for(int it:arr) {
        	System.out.print(it+" ");
        }
	}
	static void buildHeap(int arr[], int n)
	    {
	        for(int i=(n-1)/2;i>=0;i--){
	            heapify(arr,n,i);
	        }
	    }
	 
	    //Heapify function to maintain heap property.
	   static void heapify(int arr[], int n, int i)
	    {
	       int largest=i;
	       int left=2*i+1;
	       int right=2*i+2;
	       if(left<n&&arr[left]>arr[largest]){
	           largest=left;
	       }
	       if(right<n&&arr[right]>arr[largest]){
	           largest=right;
	       }
	       if(largest!=i){
	           int temp=arr[i];
	           arr[i]=arr[largest];
	           arr[largest]=temp;
	           heapify(arr,n,largest);
	       }
	    }
	    
	    //Function to sort an array using Heap Sort.
	    public static void heapSort(int arr[], int n)
	    {
	        buildHeap(arr,n);
	        for(int i=n-1;i>0;i--){
	            int temp=arr[0];
	            arr[0]=arr[i];
	            arr[i]=temp;
	            heapify(arr,i,0);
	        }
	    }
}
