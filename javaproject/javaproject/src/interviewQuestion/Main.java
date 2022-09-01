package interviewQuestion;

import java.util.*;
public class Main
{
    private static Scanner sc=new Scanner(System.in);
    static int consistency(){
        String s=sc.next();
        int charArray[]=new int[26];
        int length=s.length();
        if(length==1){
            return 0;
        }else{
            int count=0;
            for(int i=0;i<length-1;i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    count=1;
                    break;
                }
            }
            if(count==0){
                return 0;
            }
              }
                int vowel=0,consonant=0;
                for(int i=0;i<length;i++){
                    charArray[s.charAt(i)-'A']++;
                    if(isVowel(s.charAt(i))){
                        vowel++;
                    }else{
                        consonant++;
                    }
                }
                if(vowel==0&&consonant>0){
                    return consonant;
                }else if(vowel>0&&consonant==0){
                    return vowel;
                }
                int ans=Integer.MAX_VALUE;
                for(int i=0;i<26;++i){
                    if(charArray[i]>0){
                         int sum=0;
                        for(int j=0;j<26;j++){
                            if(i!=j&&charArray[j]>0){
                          if(isVowel((char)(i+'A'))==true&&isVowel((char)(j+'A'))==true){
                              sum+=(2*charArray[j]);
                          }else if(isVowel((char)(i+'A'))==true&&isVowel((char)(j+'A'))==false){
                              sum+=charArray[j];
                          }else if(isVowel((char)(i+'A'))==false&&isVowel((char)(j+'A'))==false){
                              sum+=(2*charArray[j]);
                          }else if(isVowel((char)(i+'A'))==false&&isVowel((char)(j+'A'))==true){
                              sum+=charArray[j];
                          }
                        }
                    }
                    ans=Math.min(ans,sum);
                }
            }
        return ans;
    }
	public static void main(String[] args) {
	 int t=sc.nextInt();
	 int i=0;
	 while(i<t){
		 
	   System.out.println("Case #"+(i+1)+": "+consistency());
	    i++;
	 }
	}
	static boolean isVowel(char c){
	    if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
	        return true;
	    }
	    return false;
	}
}
