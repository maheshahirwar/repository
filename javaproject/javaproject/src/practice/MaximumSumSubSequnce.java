package practice;

public class MaximumSumSubSequnce {

	public static void main(String[] args) {
		int[]a= {2,-3,-1,-1,2};
		int k=2;
		maximumSumSubSequence(a,k);
	}
public static void maximumSumSubSequence(int[]a,int k) {
	int curr=0;
	int max=0;
	for(int i=0; i<k; i++) {
		for(int j=i; j<a.length; j+=k) {
			curr=Math.max(curr+a[j], a[j]);
			max=Math.max(curr, max);
		}
	}
	System.out.println(max);
}
}
