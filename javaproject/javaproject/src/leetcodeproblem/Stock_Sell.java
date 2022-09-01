package leetcodeproblem;

public class Stock_Sell {

	public static void main(String[] args) {
		int[]a= {3,5,1,7,4,9,3};
		
		int result=maxProfit(a);
		System.out.println(result);
	}
  public static int maxProfit(int[]a) {
	 int maxprofit=0;
	 int minSoFar=a[0];
	 for(int i=0;i<a.length;i++) {
		 minSoFar=Math.min(minSoFar, a[i]);
		 int profit=a[i]-minSoFar;
		 maxprofit=Math.max(maxprofit, profit);
	 }
	  
	  return maxprofit;
  }
}
