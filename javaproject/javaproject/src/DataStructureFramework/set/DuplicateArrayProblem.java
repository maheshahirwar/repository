package DataStructureFramework.set;

import java.util.*;

public class DuplicateArrayProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
	duplicateArray(a);
	}
  public static void duplicateArray(int[]a) {
		Set<Integer>set=new LinkedHashSet<>();
		for(int it:a) {
        	set.add(it);  
          }
		System.out.println(set.size());
		int[]b=new int[set.size()];
        int i=0;
		for(int ar:set) {
        	b[i++]=ar;  
          }
		for(int item:b) {
         System.out.print(item+" ");  
          }
  }
}
