package practice;
import java.io.*;
import java.util.*;
public class UnionOfTwoArray {

	public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
     String s=br.readLine();
     String[]s1=s.trim().split(" ");
     int n=Integer.parseInt(s1[0]);
     int m=Integer.parseInt(s1[1]);
     int[]a=new int[n];
     int[]b=new int[m];
     String sA=br.readLine();
     String[]sA1=sA.trim().split(" ");
     for(int i=0; i<sA1.length;i++) {
    	 a[i]=Integer.parseInt(sA1[i]);
     }
     String sB=br.readLine();
     String[]sB1=sB.trim().split(" ");
     for(int i=0; i<sB1.length;i++) {
    	 b[i]=Integer.parseInt(sB1[i]);
     }
     Set<Integer>set=new HashSet<>();
     for(int item:a) {
    	 set.add(item);
     }
     for(int item:b) {
    	 set.add(item);
     }
     System.out.println(set.size());
	}

}
