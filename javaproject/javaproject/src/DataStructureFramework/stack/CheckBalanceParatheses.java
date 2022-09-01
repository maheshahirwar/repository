package DataStructureFramework.stack;

import java.util.*;

public class CheckBalanceParatheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String s=sc.nextLine();
			  boolean isBalance=true;
			  Stack<Character>stack=new Stack<>();
			  for(int i=0; i<s.length(); i++) {
				char ch=s.charAt(i);
			  if(ch=='('||ch=='{'||ch=='[') {
				  stack.push(ch);
				  continue;
			  }
			   if(stack.isEmpty()) {
				   isBalance=false;
			   }
			  
			if(ch==')') {
                if(!stack.isEmpty()){
				if(stack.peek()=='(') {
					stack.pop();
				}else {
					isBalance=false;
					break;
				}
                }
			}
			if(ch=='}') {
                if(!stack.isEmpty()){
				if(stack.peek()=='{') {
					stack.pop();
				}else {
					isBalance=false;
					break;
				}
                }
			}
			if(ch==']') {
               if(!stack.isEmpty()){
				if(stack.peek()=='[') {
					stack.pop();
				}else {
					isBalance=false;
					break;
				 }
		     }
            }
		   }
			  if(!stack.isEmpty()) {
				  isBalance=false;
			  }
			  if(isBalance) {
				  System.out.println("balanced");
			  }else {
				  System.out.println("not balanced");
			  }
		}
	}

}
