package practice;

import java.io.*;

public class SortingProgram {
 
	public static void sort(int[]a, int n) {
		int l=0,m=0,h=n-1;
		while(m<=h) {
			switch(a[m]) {
			case 0:
				int temp=a[m];
				a[m]=a[l];
				a[l]=temp;
				l++;
				m++;
				break;
			case 1:
				m++;
				break;
			case 2:
				int temp1=a[m];
				a[m]=a[h];
				a[h]=temp1;
				h--;
				break;
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine().trim());
    while(t-->0) {
    	int n=Integer.parseInt(br.readLine().trim());
    	int[]arr=new int[n];
    	String[]inputLine=br.readLine().trim().split(" ");
    	for(int i=0; i<n; i++) {
    		arr[i]=Integer.parseInt(inputLine[i]);
    	}
    	sort(arr,n);
    	StringBuffer str=new StringBuffer();
    	for(int i=0; i<n; i++) {
    		str.append(arr[i]+" ");
    	}
    	System.out.println(str);
    }
	}
}
