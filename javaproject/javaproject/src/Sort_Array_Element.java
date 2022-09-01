import java.util.*;

public class Sort_Array_Element {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int[]array=new int[n];
		  for(int i=0;i<n;i++) {
			  array[i]=sc.nextInt();
		  }
		  
		  // sort array element 
		  Arrays.sort(array);
		  
		  // print array
		  for(int element:array) {
			  System.out.print(element+" ");
		  }

	}

}
