package practice;
import java.util.*;
public class ArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		long []a1= {11,1,13,21,3,7};
        long []a2= {11,3,7,1};
        int n=a1.length;
        long m=a2.length;
        System.out.println(isSubset(a1,a2,n,m));
	}
	 public static String isSubset( long a1[], long a2[], long n, long m) {
		 Set<Long>set=new HashSet<>();
		 for(int i=0; i<n; i++) {
			 set.add(a1[i]);
		 }
		 long count=0;
		 for(int i=0; i<m; i++) {
			 if(set.contains(a2[i])){
				 count++;
			 }
		 }
		 if(count==m) {
			 return "Yes";
		 }else {
			 return "No";
		 }
	 }
}
