package practice;
import java.util.*;
public class GivenAnArrayOfSizeNAndANumberKFindAllElementsThatAppearMoreThanNByKTimes {

	public static void main(String[] args) {
		int []arr= {3,1,2,2,1,2,3,3};
       int k=4;
       int n=arr.length;
       result(arr,k,n);
	}
static void result(int[]arr, int k, int n) {
	Arrays.sort(arr);
	int count=1;
	for(int i=0; i<n-1; i++) {
		if(arr[i]==arr[i+1]) {
			count++;
		}else {
			count=1;
		}
		if(count>n/k) {
			System.out.print(arr[i]+" ");
		}
	}
}
}
