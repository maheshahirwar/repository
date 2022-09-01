package practice;
import java.util.*;
public class SubArraySumDivisibleByK {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(-3);
		list.add(2);
		list.add(6);
		int k=6;
		System.out.println(subArrayCount(list,k));
	}
    public static int subArrayCount(ArrayList < Integer > arr, int k) {
    	//HashMap<Integer,Integer>map=new HashMap<>();
      int []counts=new int[k];
      int sum=0;
      for(int x:arr) {
    	  sum+=(x%k+k)%k;
    	  counts[sum%k]++;
      }
      int res=counts[0];
      for(int c:counts)
    	  res+=(c*(c-1))/2;
     return res;
    }
}
