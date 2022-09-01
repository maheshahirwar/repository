package leetcodeproblem;

public class Stock_Sell_3 {

	public static void main(String[] args) {
		int[]a= {3,3,5,0,0,3,1,4};
		int res=maxProfit(a);
     System.out.println(res);
	}
	 public static int maxProfit(int[] prices) {
	        if(prices.length==0)
	            return 0;
	        
	        int fb=Integer.MIN_VALUE , sb=Integer.MIN_VALUE;
	        int fs=0,ss=0;
	        for(int i=0; i<prices.length;i++){
	            fb=Math.max(fb,-prices[i]);
	           // System.out.print(fb+" ");
	            fs=Math.max(fs,fb+prices[i]);
	            //System.out.print(fs+" ");
	            sb=Math.max(sb,fs-prices[i]);
	          // System.out.print(sb+" ");
	            ss=Math.max(ss,sb+prices[i]);
	          //  System.out.print(ss+" ");
	        }
	        return ss;
	    }
}
