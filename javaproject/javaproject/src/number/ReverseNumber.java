package number;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			int res=0;int temp;
			while(n>0) {
				 temp=n%10;
				n/=10;
				 res=(res*10)+temp;
			}
			System.out.println(res);
		  }else if(n<0) {
				n*=(-1);
				int res=0;int temp;
				while(n>0) {
					 temp=n%10;
					n/=10;
					 res=(res*10)+temp;
				}
				System.out.println((-1)*res);
			}else {
				System.out.println(0);
			}
		}
	}

