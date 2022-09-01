package number;

import java.util.Scanner;

public class Evil_Odious {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0) {
			if(n%2==1) {
				count++;
			}
			n/=2;
		}
		if(count==2) {
			System.out.println("Evil Number.");
		}else {
			System.out.println("Odious Number.");
		}
	}

}
