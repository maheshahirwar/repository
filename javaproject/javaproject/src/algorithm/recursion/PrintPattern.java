package algorithm.recursion;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    printPattern(n);
		    System.out.println();
		}
	}
	static void printPattern(int n){
	    if(n<=0){
	        System.out.print(n+" ");
	        return;
	    }
	    if(n>0){
	        System.out.print(n+" ");
	        printPattern(n-5);
	        if(n>0){
	            System.out.print(n+" ");
	        }
	    }
	    
	}
}


