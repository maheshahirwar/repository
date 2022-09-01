package CognizantPractice;

public class MaximumProfitBuyAndSellAnytime {

	public static void main(String[] args) {
		int[]ar= {5,2,6,1,7,3,6};
        int n=ar.length;
        System.out.println(maxProfit(ar));
	}
static int maxProfit(int[]ar) {
	int profit=0;
	for(int i=1;i<ar.length;i++) {
		if(ar[i]>ar[i-1]) {
			profit+=ar[i]-ar[i-1];
		}
	}
	return profit;
}
}
