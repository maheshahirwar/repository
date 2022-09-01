package practice;

public class MaximumProductSubArray {

	public static void main(String[] args) {
	int[]a= {6,-3,-10,0,2,4};
	int n=a.length;
   System.out.println(maxProduct(a,n));
	}
	static long maxProduct(int[] arr, int n) {
	    long max=1,min=1,res=1;
	    for(int i=0; i<n; i++){
	        if(arr[i]>0){
	            max*=arr[i];
	            min=Math.min(1,min*arr[i]);
	        }else if(arr[i]==0){
	            max=min=1;
	        }else{
	            // long temp=max;
	            // max=min;
	            // min=temp;
	            min+=max-(max=min);//swap
	            min*=arr[i];
	            max=Math.max(1,max*arr[i]);
	        }
	        res=Math.max(res,max);
	    }
	      return res;  
	    }
	      
}
