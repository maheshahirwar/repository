package treePractice;
import java.util.*;
public class CovertBinaryTreeToCDLL {
  static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
       Node root=createTree();
     
      
	}
	static Node createTree() {
		Node root=null;
		System.out.println("Enter data : ");
		int data=sc.nextInt();
		if(data==-1)return null;
		root = new Node(data);
		System.out.println("Enter left for "+data);
		root.left=createTree();
		System.out.println("Enter right fot "+data);
		root.right=createTree();
		return root;
	}
	 static Node bTreeToClist(Node root)
	    {
	        LinkedList<Node>ll=new LinkedList<Node>();
	        inOrder(root,ll);
	        int n=ll.size()-1;
	        for(int i=0;i<n;i++){
	            Node l=ll.get(i);
	            Node r=ll.get(i+1);
	            l.right=r;
	            r.left=l;
	        }
	        ll.get(0).left=ll.get(n);
	        ll.get(n).right=ll.get(0);
	        return ll.get(0);
	    }
	   static void inOrder(Node root,LinkedList<Node>ll){
	       if(root==null)return;
	       inOrder(root.left,ll);
	       ll.add(root);
	       inOrder(root.right,ll);
	   } 
}
class Node {
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}
