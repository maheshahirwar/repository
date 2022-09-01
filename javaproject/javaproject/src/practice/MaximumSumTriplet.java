package practice;
import java.util.*;
public class MaximumSumTriplet {

	public static void main(String[] args) {
		int[]a= {2, 5, 3, 1, 4, 9};
        System.out.println(solve(a));
	}
static int solve(int[]A) {
	int n = A.length;
	int rightMax[] = new int[n];
	rightMax[n - 1] = A[n - 1];
	for (int i = n - 2; i >= 0; i--) {
		rightMax[i] = Math.max(rightMax[i + 1], A[i]);
	}
	TreeSet<Integer> set = new TreeSet<>();
	ArrayList<Integer>list=new ArrayList<>();
	Object[] a = null;
	list.toArray(a);
	set.add(A[0]);
	int res = 0;
	for (int i = 1; i < n - 1; i++) {
		Integer lmax = set.lower(A[i]);
		int rmax = rightMax[i + 1];
		if (lmax != null && A[i] < rmax) {
			res = Math.max(res, lmax + A[i] + rmax);
		}
		set.add(A[i]);
	}
	return res;
}
}
