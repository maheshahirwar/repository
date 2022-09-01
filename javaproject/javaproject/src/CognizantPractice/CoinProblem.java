package CognizantPractice;

public class CoinProblem {

	public static void main(String[] args) {
		int[]coin= {1,2,5,10};
		int n=4;
		int l=coin.length;
		System.out.println(totalAmount(coin,l,n));

	}
static int totalAmount(int[]coin,int l,int n) {
	if(n==0)return 1;
	if(n<0)return 0;
	if(l<=0&&n>=1)return 0;
	
 return totalAmount(coin,l-1,n)+
		 totalAmount(coin,l,n-coin[l-1]);
}
}
