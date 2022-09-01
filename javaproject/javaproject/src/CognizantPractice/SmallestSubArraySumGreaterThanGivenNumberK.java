package CognizantPractice;

public class SmallestSubArraySumGreaterThanGivenNumberK {

	public static void main(String[] args) {
		int[]a= {3,4,2,5,7,6,3};
		int k=23;
		System.out.println(solve(a,k));
	}
static int solve(int[]a,int k) {
	int start=0;
	int end=0;
	int n=a.length;
	int sum=0;
	int ans=n-1;
	while(end<n) {
		while(sum<=k&&end<n) {
			sum+=a[end];
			end++;
		}
		while(sum>k&&start<n) {
			ans=Math.min(ans, end-start);
			sum-=a[start];
			start++;
		}
		
	}
	return ans;
}
}
