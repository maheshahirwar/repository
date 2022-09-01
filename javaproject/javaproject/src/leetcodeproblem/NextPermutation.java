package leetcodeproblem;

public class NextPermutation {

	public static void main(String[] args) {
		int[]a= {1,4,5};
		nextPermutation(a);
		for(int it:a) {
			System.out.print(it+" ");
		}
	}
public static void nextPermutation(int[]a) {
	int i=a.length-2;
	while(i>=0 && a[i]>=a[i+1]) {
		i--;
	}
	if(i>=0) {
		int j=a.length-1;
		while(j>=0 && a[i]>=a[j]) {
			j--;
		}
		swap(a,i,j);
	}
     reverse(a,i+1);
}
private static void swap(int[] a, int i, int j) {
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
private static void reverse(int[]a, int start) {
	int j=a.length-1;
	while(start<j) {
		swap(a,start,j);
		j--;
		start++;
	}

}
}
