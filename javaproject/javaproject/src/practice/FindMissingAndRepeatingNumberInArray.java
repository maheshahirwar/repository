package practice;

public class FindMissingAndRepeatingNumberInArray {

	public static void main(String[] args) {
		int[]a= {1,3,3};
		int n=a.length;
		int[]ans=new int[2];
      ans=findTwoNumber(a,n);
      for(int it:ans) {
    	  System.out.print(it+" ");
      }
	}
static int[] findTwoNumber(int[]a,int n) {
	int[]ans=new int[2];
	for(int i=0; i<n; i++) {
		int num=Math.abs(a[i]);
		if(a[num-1]>0) {
			a[num-1]=-a[num-1];
		}else {
			ans[0]=num;
		}
	}
	for(int i=0; i<n; i++) {
		if(a[i]>0) {
			ans[1]=i+1;
		}
	}
	return ans;
}
}
