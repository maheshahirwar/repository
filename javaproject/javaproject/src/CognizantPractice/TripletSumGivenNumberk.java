package CognizantPractice;
import java.util.*;
public class TripletSumGivenNumberk {

	public static void main(String[] args) {
		int[]ar= {1,4,45,6,10,8};
		int k=13;
		System.out.println(findTripletSum(ar,k));
		
	}
static boolean findTripletSum(int[]a,int x) {
	Arrays.sort(a);
	int i=0;
	int n=a.length;
	while(i<n) {
		int sum=x-a[i];
		int j=i+1;
		int k=n-1;
		while(j<k) {
			if(a[j]+a[k]==sum) {
				return true;
			}else if(a[j]+a[k]>sum) {
				k--;
			}else {
			j++;
			}
		}
		i++;
	}
	return false;
}
}
