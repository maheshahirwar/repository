package practice;
import java.util.*;
public class FindTripletSumGivenNumber {

	public static void main(String[] args) {
		int []a= {1, 4, 45, 6, 10, 8};
		int n=a.length;
		int x=13;
     if(find3Numbers(a,n,x)) {
    	 System.out.println(1);
     }else {
    	 System.out.println(0);
     }
	}
	 public static boolean find3Numbers(int A[], int n, int X) {
		    Arrays.sort(A);
		   for(int i=0; i<n; i++){
		       int sum=X-A[i];
		       int j=i+1;
		       int k=n-1;
		       while(j<k){
		           if(sum==A[j]+A[k]){
		               return true;
		           }else if(sum<A[j]+A[k]){
		               k--;
		           }else{
		               j++;
		           }
		       }
		   }
		   return false;
		    }
}
