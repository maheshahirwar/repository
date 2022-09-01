package DynamicProgramming;
import java.util.*;
public class Robber_House_II {

	public static void main(String[] args) {
	 int n=4;
	 int[]arr= {2,3,1,1};
	 // it is same as maximum sum adjacent problem 
	 
     if(n==1) {
    	 System.out.println(arr[0]);
     }else {
    	 ArrayList<Integer>temp1=new ArrayList<>();
    	 ArrayList<Integer>temp2=new ArrayList<>();
    	 for(int i=0;i<n;i++) {
    		 if(i!=0)temp1.add(arr[i]);
    		 if(i!=n-1)temp2.add(arr[i]);
    	 }
    	 System.out.println(Math.max(maximumSumNonAdjacentElement(temp1), maximumSumNonAdjacentElement(temp2)));
     }
	}

	private static int maximumSumNonAdjacentElement(ArrayList<Integer> arr) {
		 int prev=arr.get(0);
		 int prev1=0;
		 for(int i=1;i<arr.size();i++) {
			 int pick=arr.get(i);
			 if(i-2>=0) {
				 pick+=prev1;
			 }
			 int notpick=prev;
			 int curr=Math.max(pick, notpick);
			 prev1=prev;
			 prev=curr;
		 }
		 return prev;
	}

}
