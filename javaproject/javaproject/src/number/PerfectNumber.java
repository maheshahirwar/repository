
package number;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<n){
        	if(n%i==0){
        		sum+=i;	}
        	i++;}
        if(sum==n){
        	System.out.println("Perfect Number.");
        }else{
        	System.out.println("Not Perfect Number.");
        }
	}

}
