package algorithm.recursion;

import java.util.Scanner;

public class GameOfDeathCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(gameOfDeath(n,k));
		}
		}
	static int	gameOfDeath(int n,int k){
		    if(n==1){
		        return 1;
		    }
		    return (gameOfDeath(n-1,k)+k-1)%n+1;
		}
	}
