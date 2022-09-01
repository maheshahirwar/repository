package AmazonInterviewPreparation;
/*
 * 
 * String Compression: Implement a method to perform basic string compression using the counts 
     of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the 
     "compressed" string would not become smaller than the original string, your method should return 
     the original string. You can assume the string has only uppercase and lowercase letters (a - z).
   Input s: aabcccccaaa;
   Output : a2b1c5a3  (s.length()>=output.length());
 */
public class StringCompress {

	public static void main(String[] args) {
	String s="aabcccccaaa";
	System.out.println(compressString(s));
	}
public static String compressString(String s) {
	int finalLength=countLength(s);
	if(finalLength>s.length())return s;
	StringBuilder compress=new StringBuilder(finalLength);
	int countCompress=0;
	for(int i=0;i<s.length();i++) {
		countCompress++;
		if(i+1>=s.length()||s.charAt(i+1)!=s.charAt(i)) {
			compress.append(s.charAt(i));
			compress.append(countCompress);
			countCompress=0;
		}
	}
	return compress.toString();
}
public static int countLength(String s) {
	int len=0,countCompress=0;
	for(int i=0;i<s.length();i++) {
		countCompress++;
		if(i+1>=s.length()||s.charAt(i+1)!=s.charAt(i)) {
			len+=1+String.valueOf(countCompress).length();
			countCompress=0;
		}
	}
	return len;
}
}
