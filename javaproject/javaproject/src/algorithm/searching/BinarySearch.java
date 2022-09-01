package algorithm.searching;

import java.io.*;

public class BinarySearch {
static int count=0;
	public static void main(String[] args) throws Exception {
		int[]a= {12,16,17,19,23,35,40};
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//	String s=br.readLine();
	//	int item = Integer.parseInt(s);
		int n=a.length;
		int loc=-1;
		loc=binarySearch(a,0,n,23);
		if(loc!=-1) {
			System.out.println("Item found "+loc);
		}else {
			System.out.println("Not found");
		}
	}
  public static int binarySearch(int[]a, int li, int hi, int item) {
	  int mid;
	  while(li<=hi) {
		  mid=(li+hi)/2;
		  if(a[mid]==item) {
			  return count;
		  }else if(a[mid]<item) {
			 li=mid;	
			 count++;
		  }else {
			 hi=mid-1;
			 count++;
		  }
	  }
	  return count;
  }
}
