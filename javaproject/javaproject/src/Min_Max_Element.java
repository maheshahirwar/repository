import java.util.Scanner;

public class Min_Max_Element {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int[]array=new int[n];
		  for(int i=0;i<n;i++) {
			  array[i]=sc.nextInt();
		  }
		  
		  // min max element
		 int min=Integer.MAX_VALUE;
		 int max=Integer.MIN_VALUE;
		 for(int element:array) {
			 min=Math.min(min, element);
			 max=Math.max(max, element);
		 }
		 System.out.println(min+" "+max);

	}

}
