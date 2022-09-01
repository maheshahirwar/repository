package DSApractice;


public class BubbleSort {

	public static void main(String[] args) {
	
		int[]a= {33,65,232,12,33,544,65,23,65,24,66,475,35,77,33,66,245,87,66};

		bubbleSort(a);
	}
  public static void bubbleSort(int[]a) {
	  int n=a.length;
	
  for(int i=0; i<n-1; i++){
	  boolean sorted=true;
	  
		for(int j=0; j<n-i-1; j++){
			if(a[j]>a[j+1])
				swap(a,j,j+1);
			sorted=false;
			}
		if(sorted)break;
		}
	for(int item:a) {
		System.out.print(item+" ");
		}
	}
private static void swap(int[]a,int i, int j) {
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
}
