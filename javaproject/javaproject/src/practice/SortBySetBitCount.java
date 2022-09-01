package practice;
import java.util.*;
public class SortBySetBitCount {

	public static void main(String[] args) {
		Integer []ar= {5,3,2,9,7,6,15,32};
       sortSetBitCout(ar);
       for(Integer it:ar) {
    	   System.out.print(it+" ");
       }
	}
static void  sortSetBitCout(Integer[]ar) {
	Arrays.sort(ar,(a,b)->Integer.compare(Integer.bitCount(b),Integer.bitCount(a)));
}
}
