package AmazonInterviewPreparation;

import java.util.*;

public class Sort_Stack {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     Stack<Integer>s=new Stack<>();
     while(n-->0) {
    	 s.push(sc.nextInt());
     }
     s=sortStack(s);
     System.out.println(s);
	}
public static Stack<Integer> sortStack(Stack<Integer>s){
	Stack<Integer>help=new Stack<>();
	while(!s.empty()) {
		int val=s.pop();
		while(!help.empty()&&help.peek()<val)s.push(help.pop());
		help.push(val);
	}
	while(!help.empty())s.push(help.pop());
	return s;
}
}
