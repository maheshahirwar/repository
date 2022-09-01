package practice;

public class MinimumSwapAndKTogether {

	public static void main(String[] args) {
		int[]a= {1, 2,5,7,3};
		int n=a.length;
		int k=3;
    System.out.println(minSwap(a,n,k));
	}
	 public static int minSwap (int arr[], int n, int k) {
	      int g=0,b=0;
	      for(int i=0; i<n; i++){
	          if(arr[i]<=k)
	          g++;
	      }
	      for(int i=0; i<g; i++){
	          if(arr[i]>k)
	          b++;
	      }
	        int i=0,j=g,ans=b;
	        while(j<n){
	            if(arr[i]>k){
	                b--;
	            }
	            if(arr[j]>k){
	                b++;
	            }
	            ans=Math.min(ans,b);
	            i++;j++;
	        }
	       return ans; 
	    }
	    
}
