import java.util.*;
public class MaxSubArray {

	public static void main(String[] args) {
		int[]a= {6,-3,-10,0,2};
      System.out.println(maxProductSubArray(a));
	}
static long  maxProductSubArray(int[]a) {
long res=1;
long max=1,min=1;
for(int i=0;i<a.length;i++) {
	if(a[i]<0) {
		min+=max-(max=min);
		min*=a[i];
		max=Math.max(max*a[i], 1);
	}else if(a[i]==0) {
		max=min=1;
	}else {
		max*=a[i];
		min=Math.min(min*a[i], 1);
	}
	res=Math.max(max, res);
}
return res;
}
}
