package practice;

public class CountPairOfGivenSum {

	public static void main(String[] args) {
		int[]a= {1,1,1,1};
		int k=2;
		System.out.println(getPairsCount(a,k));
	}
public static int getPairsCount(int[]arr, int k) {
	int count=0; 
	for(int i=0; i<arr.length; i++) {
		if(arr[i]<k) {
			int res=arr[i];
			for(int j=i+1; j<arr.length; j++) {
				if(res+arr[j]==k) {
					count++;
				}
			}
		}
	}
	return count;
}
}
