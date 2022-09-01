import java.util.*;
public class Subarraywithgivensum {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int n=10;
		int s=15;
		int sum=0;
		int ind=0;
		ArrayList<Integer>ans=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(sum>s) {
				while(sum>s) {
					sum-=arr[ind];
					ind++;
				}
			}
			if(sum==s) {
				ans.add(ind+1);
				ans.add(i+1);
				break;
			}
		}
     System.out.println(ans.size()>0?ans:-1);
	}

}
