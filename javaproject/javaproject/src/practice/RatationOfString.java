package practice;
/*
 * Rotation of string is present or not given two string s1 and s2. 
 * check whether string is rotation or not
 * string s1="ABCD", string s2="CDAB" return true
 */
public class RatationOfString {

	public static void main(String[] args) {
		String s1="ABCD";
		String s2="ADAB";
		if(rotation(s1,s2)) {
			System.out.println("Rotation string to each other");
		}else {
			System.out.println("Ratotion is not possible to each other");
		}

	}
  static boolean rotation(String s1, String s2) {
	  String s=s1+s1;
	 return s.contains(s2)?true:false;
  }
}
