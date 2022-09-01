package number;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=sc.nextInt();
		Random t=new Random();
		for(int i=1; i<=n; i++) {
			System.out.println(t.nextInt(max));
		}
	}

}
