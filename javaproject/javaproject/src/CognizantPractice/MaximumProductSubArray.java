package CognizantPractice;

public class MaximumProductSubArray {

	public static void main(String[] args) {
     int[]a= {6,-3,-10,0,2};
     System.out.println(maxProduct(a));
	}
static int maxProduct(int[]a) {
	int n=a.length;
	int max=1;
	int min=1;
	int res=1;
	for(int i=0;i<n;i++) {
		if(a[i]>0) {
			max*=a[i];
			min=Math.min(min*a[i],1);
		}else if(a[i]==0) {
			min=max=1;
		}else {
			min+=max-(max=min);
			min*=a[i];
			max=Math.max(a[i]*max, 1);
		}
		res=Math.max(res, max);
	}
	return res;
}
}
