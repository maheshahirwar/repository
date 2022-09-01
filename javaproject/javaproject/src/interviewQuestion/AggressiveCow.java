package interviewQuestion;
import java.util.*;
import java.lang.*;
// very very important problem
public class AggressiveCow {

		public static void main (String[] args) throws java.lang.Exception
		{
		  Scanner sc=new Scanner(System.in);
		  int t=sc.nextInt();
		  while(t-->0){
		  	int n=sc.nextInt();
		  	int c=sc.nextInt();
		  	int[]a=new int[n];
		  	for(int i=0;i<n;i++){
		  		a[i]=sc.nextInt();
		  	}
		  	System.out.println(getMaxDistance(a,c));
		  }
		}
		static int getMaxDistance(int[]a,int c){
			if(a.length==0)return 0;
			Arrays.sort(a);
			int low=1;
			int high=a[a.length-1]-1;
			int ans=0;
			while(low<=high){
				int mid=(high+low)/2;
				if(isPossible(a,mid,c)){
					ans=mid;
					low=mid+1;
				}else{
					high=mid-1;
				}
			}
			return ans;
		}
	static	boolean isPossible(int[]a,int mid,int c){
			int last=a[0];
			int count=1;
			for(int i=1;i<a.length;i++){
				if(a[i]-last>=mid){
					count++;
					last=a[i];
				}
				if(count==c)return true;
			}
			return false;
		}

}
