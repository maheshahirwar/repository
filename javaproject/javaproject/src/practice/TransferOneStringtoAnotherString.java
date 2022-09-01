package practice;

public class TransferOneStringtoAnotherString {

	public static void main(String[] args) {
		String A="ABD";
		String B="BAD";
		System.out.println(transfer(A,B));
	}
static int transfer(String A,String B) {
	if(A.length()!=B.length())return -1;
	if(A.length()==0||B.length()==0)return 0;
	int count=0;
	for(int i=A.length()-1; i>0;i--) {
		if(B.charAt(i)!=A.charAt(i)) {
			A=A.charAt(i)+A.substring(0, i)+A.substring(i+1);
			count++;
		}
	}
	return count;
}
}
