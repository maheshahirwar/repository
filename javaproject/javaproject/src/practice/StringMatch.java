package practice;

public class StringMatch {

	public static void main(String[] args) {
	String seq="GACCBDDBAGEE";
	int n=3;
	System.out.println(runCus(n,seq));
	}
	static int runCus(int n,String seq) {
		char[]seen=new char[26];
		int res=0,occupied=0;
		for(int i=0; i<seq.length();i++) {
			int index=seq.charAt(i)-'A';
			if(seen[index]==0) {
				seen[index]=1;
				if(occupied<n) {
					occupied++;
					seen[index]=2;
				}else {
					res++;
				}
			}else {
				if(seen[index]==2)
					occupied--;
			seen[index]=0;	
			}
		}
		return res;
	}
}
