package practice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

public class FactorialOfLargeNumber {

	public static void main(String[] args) {
	int n=10;
	ArrayList<Integer>ans=new ArrayList<>();
		ans=factorial(n);
//        System.out.println(ans);
		for(int it:ans) {
			System.out.print(it+"");
		}
	}
static ArrayList<Integer> factorial(int N){
	ArrayList<Integer>ans=new ArrayList<>();
	BigInteger fact=new BigInteger("1");
	for(Integer i=2; i<=N; i++) {
		fact=fact.multiply(BigInteger.valueOf(i));
//		System.out.println(fact);
		
	}
	String a = String.valueOf(fact);
	for(char c:a.toCharArray()) {
		ans.add(Integer.parseInt(c+""));
	}
	return ans;
}
}
