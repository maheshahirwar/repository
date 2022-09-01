import java.util.Scanner;

public class SolvedProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long i=1;
		long ans=0;
		while(i<=n) {
		   long sum=sumOfQuardicPow(i);
		   long prod=prodOfDigit(i);
		   long x=Math.max(sum, prod);
		   long y=Math.min(sum, prod);
		   if(gcd(x,y)>1)ans++;
			i++;	
		}
     System.out.println(ans);
	}

	private static long gcd(long sum, long prod) {
		if(prod==0)return sum;
		
		return gcd(prod,sum%prod);
	}

	private static long prodOfDigit(long i) {
		long prod=1;
		while(i>0) {
			prod*=(i%10);
			i/=10;
		}
		return prod;
	}

	private static long sumOfQuardicPow(long i) {
		long temp=i;
		long sum=0;
		while(temp>0) {
			sum+=Math.pow(temp%10, 4);
			temp/=10;
		}
	return sum;
	}

}
