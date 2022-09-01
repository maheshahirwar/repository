import java.util.*;
public class Solveeee {

	public static void main(String[] args) {
		String[] s= {"abc","dad","bc"};   
		List<String>ans=new ArrayList<>();
    allsubsequence(s,ans,"");
    //rearrange(ans);
    List<Rank>rank=new ArrayList<Rank>();
    setrank(ans,rank);
    System.out.println(ans);
    for(Rank r:rank) {
    	System.out.println(r.value+"-->"+r.r);
    }
}

private static void setrank(List<String> ans, List<Rank> rank) {
	 rank.add(new Rank("{}",1));
	 for(int i=0;i<ans.size();i++) {
		 rank.add(new Rank(ans.get(i),i+2));
	 }
	}

private static void rearrange(List<String> ans) {
      Collections.sort(ans,(a,b)->a.length()-b.length());
	}

private static void allsubsequence(String[] s, List<String> ans, String string) {
	if(s.length==0) {
		ans.add(string);
		Collections.reverse(ans);
		return;
	}
	String ch=s[s.length-1];
	int len=s.length-1;
	String[] rem=Arrays.copyOf(s, len);
	allsubsequence(rem,ans,string+ch);
	allsubsequence(rem,ans,string);
	}
}
class Rank{
	int r;
	String value;
	Rank(String value,int r){
		this.value=value;
		this.r=r;
	}
}