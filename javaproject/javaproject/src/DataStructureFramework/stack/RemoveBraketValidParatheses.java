package DataStructureFramework.stack;
import java.util.*;
public class RemoveBraketValidParatheses {

	public static void main(String[] args) {
		String s="(()))(()";
         char[]c=s.toCharArray();
         Stack<Integer>stack=new Stack<>();
         for(int i=0;i<c.length;i++) {
        	 if(c[i]=='(') {
        		 stack.add(i);
        	 }else if(c[i]==')') {
        		 if(stack.isEmpty()) {
        			 c[i]=' ';
        		 }else {
        			 stack.pop();
        		 }
        	 }
         }
         while(stack.size()>0) {
        	 c[stack.pop()]=' ';
         }
         for(int i=0;i<c.length;i++) {
        	 if(c[i]!=' ') {
        	 System.out.print(c[i]);
         }
         }
	}

}
