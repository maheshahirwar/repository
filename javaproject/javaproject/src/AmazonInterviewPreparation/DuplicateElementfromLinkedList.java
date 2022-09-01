package AmazonInterviewPreparation;
import java.util.*;
public class DuplicateElementfromLinkedList {

	public static void main(String[] args) {
	 Node root=new Node(3);
	 root.next=new Node(45);
	 root.next.next=new Node(5);
	 root.next.next.next=new Node(45);
	 root.next.next.next.next=new Node(4);
	 root=deleteDup(root);
	 while(root!=null) {
		 System.out.print(root.data+" ");
		 root=root.next;
	 }
	}
public static Node deleteDup(Node root) {
	Set<Integer>set=new HashSet<>();
	Node temp=root;
	Node head=temp;
	Node prev=null;
	while(temp!=null) {
		if(set.contains(temp.data)) {
		 prev.next=temp.next;
		}else {
			set.add(temp.data);
			prev=temp;
		}
		temp=temp.next;
	}
	return head;
}
}
class Node{
	Node next;
	int data;
	public Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.next=null;
		this.left=this.right=null;
	}
}