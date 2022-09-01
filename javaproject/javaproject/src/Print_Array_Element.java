import java.util.Scanner;

public class Print_Array_Element {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		//print Array element
		for(int element:array) {
			System.out.print(element+" ");
		}
	}
}
