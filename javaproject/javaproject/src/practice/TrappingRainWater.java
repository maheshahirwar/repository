package practice;

public class TrappingRainWater {

	public static void main(String[] args) {
	int[]a= {3,0,0,2,0,4};
	int n=a.length;
	System.out.println(trappingWater(a,n));

	}
	 static int trappingWater(int arr[], int n) { 
	      int l=0,r=n-1;
	      int left=0,right=0,res=0;
	      while(l<r){
	          if(arr[l]<arr[r]){
	              if(arr[l]>left){
	                  left=arr[l];
	              }else{
	                  res+=left-arr[l];
	             }
	              l++;
	          }else{
	              if(arr[r]>right){
	                  right=arr[r];
	              }else{
	                  res+=right-arr[r];
	              }
	              r--;
	          }
	      }
	      return res;
	    } 
}
