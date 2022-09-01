package infosys_coding_practice;

import java.util.Scanner;

/*
 * input1:
 *  6 <-- Number of character in string
 *   111011 <-- Given String
 *   7 <-- Initial Cost to be operation
 *   1 <-- for swap cost
 *   3 <-- for flip cost
 *   
 *   output: 7
 *   explaination : 
 *        first swap 0 at left first position 
 *        011111
 *        and two time flip 1 at left side
 *        3+3=6<7
 *        000111
 *        final 111 == 7 
 */

public class swap_and_flip_character {

	static  int n,totalCost,forSwapCost,forFlipCost;
	 static String s;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 s=sc.next();
		 totalCost=sc.nextInt();
		 forSwapCost=sc.nextInt();
		 forFlipCost=sc.nextInt();
		if(forSwapCost<forFlipCost) {
			swap();
			flip();
		}else {
			flip();
			swap();
		}
		System.out.println(Integer.parseInt(s, 2));

	}
	static void swap() {
		char[]ch=s.toCharArray();
		int i=0;
		for(int a=0;a<ch.length;a++) {
			if(ch[a]=='1') {
				i=a;
				break;
			}
		}
		int j=s.length()-1;
		while(j>i) {
			if(totalCost<forSwapCost)break;
			if(ch[j]=='0') {
				if(ch[i]=='0') {
				 i++;	
				}else {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					totalCost-=forSwapCost;
					j--;
				}
			}else {
				j--;
			}
		}
		s=new String(ch);
	}
	static void flip() {
		char[]ch=s.toCharArray();
		int i=0;
		for(int a=0;a<ch.length;a++) {
			if(ch[a]=='1') {
				i=a;
				break;
			}
		}
		while(totalCost>=forFlipCost) {
			if(i==s.length())break;
			if(ch[i]=='1') {
				ch[i]='0';
				totalCost-=forFlipCost;
				i++;
			}
		}
		s=new String(ch);
	}

}
