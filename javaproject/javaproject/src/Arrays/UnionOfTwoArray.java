package Arrays;

import java.io.*;
import java.util.*;
public class UnionOfTwoArray {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   String str=br.readLine();
		   int t=Integer.parseInt(str);
		   while(t-->0){
		       String s=br.readLine();
		       String[] s1=s.trim().split(" ");
		       int n=Integer.parseInt(s1[0]);
		       int m=Integer.parseInt(s1[1]);
		       int[]A=new int[n];
		       String sA=br.readLine();
		       String[]sA1=sA.trim().split(" ");
		       for(int i=0; i<sA1.length; i++){
		           A[i]=Integer.parseInt(sA1[i]);
		       }
		       int[]B=new int[m];
		       String sB=br.readLine();
		       String[]sB1=sB.trim().split(" ");
		       for(int i=0; i<sB1.length; i++){
		           B[i]=Integer.parseInt(sB1[i]);
		       }
		       Set<Integer>set=new HashSet<>();
		       for(int i=0; i<A.length; i++){
		           set.add(A[i]);
		       }
		       for(int j=0; j<B.length; j++) {
		    		   set.add(B[j]);
		   }
           System.out.println(set.size());
	}
	}
}
