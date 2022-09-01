package practice;

public class SmallestDistinctWindow {

	public static void main(String[] args) {
		String s="AABBBCBBAC";
        System.out.println(smallestWindow(s));
	}
static String smallestWindow(String s) {
int[]count=new int[256];
int dis=0;
for(char a:s.toCharArray()) {
	if(count[a]==0) {
		dis++;
		count[a]++;
	}
}

   int count1=0;
String result="";
int i=0,length=Integer.MAX_VALUE;
for(int j=0; j<s.length();j++) {
	if(--count[s.charAt(j)]>=0)
		count1++;
	
	while(count1==dis) {
		if(length>j-i+1) {
			length=j-i+1;
			result=s.substring(i, j+1);
		}
		if(++count[s.charAt(i)]>0)
			count1--;
			i++;
	}
}
return result;
}
}
