package CognizantPractice;

public class MaximumProfitBuyingAndSellingAtmostTwice {

	public static void main(String[] args) {
		int[]ar= {3,3,5,0,0,3,1,4};
		int n=ar.length;
		System.out.println(maxProfit(ar,n));
	}
 static int maxProfit(int[]ar,int n) {
	 int fb=Integer.MIN_VALUE;
	 int sb=Integer.MIN_VALUE;
	 int fs=0,ss=0;
	 for(int i=0;i<n;i++) {
		 fb=Math.max(fb, -ar[i]);
		 fs=Math.max(fs, fb+ar[i]);
		 sb=Math.max(sb, fs-ar[i]);
		 ss=Math.max(ss, sb+ar[i]);
	 }
	 return ss;
 }
}
