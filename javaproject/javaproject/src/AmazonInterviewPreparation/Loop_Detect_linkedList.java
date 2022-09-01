package AmazonInterviewPreparation;

import java.util.Scanner;

public class Loop_Detect_linkedList {

	static class MyNode{
		int data;
		MyNode next;
		MyNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MyNode temp=new MyNode(0);
		MyNode head=temp;
		
		for(int i=0;i<n;i++) {
			head.next=new MyNode(sc.nextInt());
			head=head.next;
		}
		int k=sc.nextInt();
		temp=temp.next;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//		}
		temp=createLoop(temp,k-1);
		MyNode ans=detectLoop(temp);
		if(ans==null) {
			System.out.println("No loop detect...");
		}else {
		    System.out.println(ans.data);
		}
	}
	private static MyNode detectLoop(MyNode temp) {
		MyNode slow=temp,fast=temp;
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast.data==slow.data)break;
		}
		if(fast.next==null||fast==null)return null;
		fast=temp;
		while(fast!=slow) {
			fast=fast.next;
			slow=slow.next;
		}
		return slow;
	}
	private static MyNode createLoop(MyNode temp,int k) {
		MyNode head=temp;
		while(head.next!=null) {
			head=head.next;
		}
		int i=0;
		MyNode slow=temp;
		while(i<k) {
			slow=slow.next;
			i++;
		}
		head.next=slow;
		return temp;
	}

}
