package CognizantPractice;
// Asked in microsoft,amazon,walmart etc.
import java.util.*;
public class FindLongestConsecutiveSubsequence {

	public static void main(String[] args) {
		int[]a= {5,6,3,6,1,2,3,4,5,6,7};
       int n=a.length;
        System.out.println(findLongestConsecutiveSubsequence(a,n));
	}
 static int findLongestConsecutiveSubsequence(int[]arr,int n) {
	 Arrays.sort(arr);
	 int count=1;
	 int res=1;
	 for(int i=0;i<n-1;i++) {
		 if(arr[i]+1==arr[i+1]) {
			 count++;
		 }else if(arr[i]==arr[i+1]) {
			 continue;
		 }else {
			 res=Math.max(res, count);
		 }
		 res=Math.max(res, count);
	 }
	 return res;
 }
}
