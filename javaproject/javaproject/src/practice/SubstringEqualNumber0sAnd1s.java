package practice;

public class SubstringEqualNumber0sAnd1s {

	public static void main(String[] args) {
		String str = "0100110101";
	    int n = str.length();
	 
	    System.out.println(maxSubStr(str, n));

	}
  static int maxSubStr(String s, int n) {
	  int count=0;
	  int count0=0,count1=0;
	  for(int i=0; i<n; i++) {
		  if(s.charAt(i)=='0') {
			  count0++;
		  }else {
			  count1++;
		  }
		  if(count0==count1) {
			  count++;
		  }
	  }
	  if(count==0) {
		  return -1;
	  }else {
	  return count;
	  }
  }
}
