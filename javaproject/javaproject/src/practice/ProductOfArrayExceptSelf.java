package practice;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int []a= {1,2,3,4};
		int n=a.length;
		
		a=getProductArrayExceptSelf(a);
		for(int it:a) {
			System.out.print(it+" ");
		}
	}
	  public static int[] getProductArrayExceptSelf(int[] arr) {
		   int n=arr.length; 	
	       int []ans=new int[n];
	       int rp=1;
	       for(int i=0; i<n; i++){
	           ans[i]=rp;
	           rp=rp*arr[i];
	       }
	      rp=1;
	       for(int i=n-1; i>=0; i--){
	           ans[i]=ans[i]*rp;
	           rp*=arr[i];
	       }
	       return ans;
	   }
}
