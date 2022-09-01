package CognizantPractice;

public class MinimumSwapToBringGoodNumberTogether {

	public static void main(String[] args) {
		int[]a= {1,2,5,6,7,3};
		int k=3;
		int n=a.length;
		System.out.println(minimumSwap(a,n,k));
	}
static int minimumSwap(int[]a,int n,int k) {
	int good=0;
	int bad=0;
	int ans=0;
	for(int i=0;i<n;i++) {
		if(a[i]<=k) {
			good++;
		}
	}
	for(int i=0;i<good;i++) {
		if(a[i]>k) {
			bad++;
		}
	}
	ans=bad;
	int i=0; int j=good;
	while(j<n) {
		if(a[i]>k) {
			bad--;
		}
	    if(a[j]>k) {
	    	bad++;
	    }
	    ans=Math.min(ans, bad);
	    i++;j++;
	}
	return ans;
}
}
