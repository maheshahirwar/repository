import java.util.Scanner;

public class Reverse_Array_element {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int[]array=new int[n];
	  for(int i=0;i<n;i++) {
		  array[i]=sc.nextInt();
	  }
	  //reverse array element
	  for(int i=array.length-1;i>=0;i--) {
		  System.out.print(array[i]+" ");
	  }
	}

}
