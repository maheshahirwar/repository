package leetcodeproblem;

public class MedianTwoSortedArray {

	public static void main(String[] args) {
	int[]l= {1,12,15,26,38};
	int[]r= {2,13,17,30,45,56};
	int n=l.length;
	int m=r.length;
	int a[]=new int [n+m];
	int i=0,j=0,k=0;
	while(i<n&&j<m) {
		if(l[i]<=r[j]) {
			a[k]=l[i];
			i++;
		}else {
			a[k]=r[j];
			j++;
		}
		k++;
	}
	while(i<n) {
		a[k]=l[i];
		i++;
		k++;
	}
	while(j<m) {
		a[k]=r[j];
		j++;
		k++;
	}
//	for(int item:a) {
//		System.out.print(item+" ");
//	}
//	int len=a.length/2;
//	System.out.println(a[len]+" ");
	 medianTwoArray(a);
	}
	
   public static void medianTwoArray(int[] a) {
	   int mid=a.length/2;
	   if(a.length%2==0) {
	 System.out.println((a[mid-1]+a[mid])/2);
   }else {
	   System.out.println(a[mid]);
   }
   }
}
