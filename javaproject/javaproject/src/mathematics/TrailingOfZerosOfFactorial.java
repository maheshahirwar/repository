package mathematics;

import java.io.*;

public class TrailingOfZerosOfFactorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int n=Integer.parseInt(s);
		int res=0;
		for(int i=5; i<n; i*=5) {
			res+=n/i;
		}
		System.out.println(res);
	}

}
