package mathematics;

import java.io.*;

public class GCD {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
        int a=Integer.parseInt(s);
        String s1=br.readLine();
        int b=Integer.parseInt(s1);
        System.out.println(gcd(a,b));
	}
    static int gcd(int a, int b) {
//    	if(b==0)return a;
//    	else return gcd(b,a%b);
    	return a%b==0 ? b:gcd(b,a%b);
    }
}
