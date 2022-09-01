package algorithm.dynamicProgramming;

import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=getNthUglyNo(n);
		System.out.println(n+"th ugly number is "+ans);

	}
static long getNthUglyNo(int n) {
	long[]ugly=new long[n];
	long multipleOf2=2;
	long multipleOf3=3;
	long multipleOf5=5;
	int i2=0,i3=0,i5=0;
	long uglyNo=1;
	ugly[0]=1;
	for(int i=1;i<n;i++) {
		uglyNo=Math.min(multipleOf2, Math.min(multipleOf3, multipleOf5));
		ugly[i]=uglyNo;
		if(uglyNo==multipleOf2) {
			i2++;
			multipleOf2=ugly[i2]*2;
		}
		if(uglyNo==multipleOf3) {
			i3++;
			multipleOf3=ugly[i3]*3;
		}
		if(uglyNo==multipleOf5) {
			i5++;
			multipleOf5=ugly[i5]*5;
		}
	}
	return uglyNo;
}
}
