package CognizantPractice;

public class MaximumProfitBuyAndSell {

	public static void main(String[] args) {
    int[]ar= {5,2,6,1,4};
      System.out.println(maxProfit(ar));
	}
static int maxProfit(int[]ar) {
	int  mp=0;
	int buy=ar[0];

	for(int i=0;i<ar.length;i++) {
	 buy=Math.min(buy, ar[i]);
	 int p=ar[i]-buy;
	  mp=Math.max(mp, p);
	}
	return mp;
}
}
