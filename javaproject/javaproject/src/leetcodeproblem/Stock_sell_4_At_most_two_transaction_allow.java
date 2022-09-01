package leetcodeproblem;
import java.util.*;
public class Stock_sell_4_At_most_two_transaction_allow {

	public static void main(String[] args) {
		 int []a={2, 30, 15, 10, 8, 25, 80};
		 int n=a.length;
		 int[]dpl=new int[n];
		 
		 int min=a[0];
		 for(int i=1;i<n;i++){
		      min=Math.min(a[i],min);
		     dpl[i]=Math.max(dpl[i-1],a[i]-min);
		 }
		 int[]dpr=new int[n];
		 int maxr=a[n-1];
		 for(int i=n-2;i>=0;i--){
		     maxr=Math.max(a[i],maxr);
		     dpr[i]=Math.max(dpr[i+1],maxr-a[i]);
		 }
		 int maxprofit=0;
		 for(int i=0;i<n;i++){
		     maxprofit=Math.max(maxprofit,dpl[i]+dpr[i]);
		 }
		 System.out.println(maxprofit);

	}

}
