package mathematics;
import java.io.*;
public class PalindromNumber {

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   String s=br.readLine();
	   int n=Integer.parseInt(s);
	   int num=n;
	  int res=0;
	   while(n>0) {
		   int temp=n%10;
		   res=(res*10)+temp;
		   n/=10;
	   }
	   if(num==res) {
		   System.out.println("Number is palinfrom");
	   }else {
		   System.out.println("Number is not palindrom");
	   }
	}

}
