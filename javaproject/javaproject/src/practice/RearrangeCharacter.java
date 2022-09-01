package practice;
import java.util.*;
public class RearrangeCharacter {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t-->0){
	          String s=sc.next();
	         String s1=rearrangeCharacter(s);
	         if(s1.length()!=s.length()){
	             System.out.println(0);
	         }else{
	             System.out.println(1);
	         }
	      }
	 }
	 static String rearrangeCharacter(String s){
	     Map<Character,Integer>counts=new HashMap<>();
	     for(char c:s.toCharArray()){
	         counts.put(c,counts.getOrDefault(c, 0)+1);
	     }
	     PriorityQueue<Character>maxHeap=new PriorityQueue<>((a,b)->counts.get(b)-counts.get(a));
	     maxHeap.addAll(counts.keySet());
	    StringBuilder result=new StringBuilder();
	     while(maxHeap.size()>1){
	         char current=maxHeap.remove();
	         char next=maxHeap.remove();
	         result.append(current);
	         result.append(next);
	         counts.put(current,counts.get(current)-1);
	         counts.put(next,counts.get(next)-1);
	         if(counts.get(current)>0){
	             maxHeap.add(current);
	         }
	         if(counts.get(next)>0){
	             maxHeap.add(next);
	         }
	     }
	     if(!maxHeap.isEmpty()){
	         char last=maxHeap.remove();
	         if(counts.get(last)>1){
	            return "";
	         }
	         result.append(last);
	     }
	    return result.toString();
	 }
}
