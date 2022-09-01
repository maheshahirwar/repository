package CognizantPractice;

public class CountAndSay {

	public static void main(String[] args) {
		int n=5;
		String ans=countAndSay(n);
		System.out.println(ans);
	}
static String countAndSay(int n) {
	if(n==1)return "1";
	
	StringBuilder sb=new StringBuilder();
	int count=0;
	String prev=countAndSay(n-1);
	for(int i=0;i<prev.length();i++) {
	 count++;
	 if(i==prev.length()-1||prev.charAt(i)!=prev.charAt(i+1)) {
		 sb.append(count).append(prev.charAt(i));
		 count=0;
	 }
		
	}
	return sb.toString();
}
}
