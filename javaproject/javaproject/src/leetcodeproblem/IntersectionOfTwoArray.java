package leetcodeproblem;
import java.util.*;
public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		 int[]n1= {2,1};
	      int[]n2= {1,1};
	      int []a=intersection(n1,n2);
	      for(int i:a) {
	    	  System.out.print(i+" ");
	      }
		}
	    public static int[] intersection(int[]nums1, int[]nums2) {
	    	HashSet<Integer>set1=new HashSet<>();
	    	for(Integer a:nums1) {
	    		set1.add(a);
	    	}
	    	HashSet<Integer>set2=new HashSet<>();
	    	for(int b:nums2) {
	    		set2.add(b);
	    	}
	    	if(set1.size()>set2.size())
	    		return set_intersection(set1,set2);
	        else
	    		return set_intersection(set2,set1);
	    	 }
	    public static int[] set_intersection(HashSet<Integer> set1,HashSet<Integer> set2) {
	    	int[]output=new int[set1.size()];
	    	int i=0;
	    	for(Integer s:set1) {
	    		if(set2.contains(s)) output[i++]=s;
	    	}
	    	return Arrays.copyOf(output, i);

	}

}
