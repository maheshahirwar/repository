package DSApractice;

public class InsertionSort {

	public static void main(String[] args) {
		int[]a= {33,65,232,12,33,544,65,23,65,24,66,475,35,77,33,66,245,87,66};
 insertionSort(a);
	}
static void insertionSort(int []a) {
	int n=a.length;
	int temp,j;
	for(int i=1; i<n; i++) {
		temp=a[i];
		j=i;
		while(j>0&&a[j-1]>temp) {
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
	}
	for(int it:a) {
		System.out.print(it+" ");
	}
}
}
