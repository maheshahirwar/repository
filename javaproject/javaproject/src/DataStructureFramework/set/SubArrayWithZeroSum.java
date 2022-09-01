package DataStructureFramework.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		boolean found = false;
		Set<Integer>set=new HashSet<>();
        int sum=0;
        for(int ele : a) {
        	set.add(sum);
        	sum+=ele;
        	if(set.contains(sum)) {
        		found=true;
        		break;
        	}
        }
        System.out.println(set);
        System.out.println("Found "+found);
	}

}
