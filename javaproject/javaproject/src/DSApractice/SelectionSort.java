package DSApractice;

public class SelectionSort {

	public static void main(String[] args) {
		int[]a= {33,65,232,12,33,544,65,23,65,24,66,475,35,77,33,66,245,87,66};
     selectionSort(a);
	}
static void selectionSort(int[]a) {
	int n=a.length;
	for(int i=0; i<n-1; i++) {
		int mid=i;
		for(int j=i; j<n; j++) {
			if(a[mid]>a[j]) {
				mid=j;
			}
		}
		int temp=a[i];
		a[i]=a[mid];
		a[mid]=temp;
	}
	for(int it:a) {
		System.out.print(it+" ");
	}
}
}
