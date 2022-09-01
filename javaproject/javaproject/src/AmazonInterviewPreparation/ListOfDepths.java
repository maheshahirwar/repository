package AmazonInterviewPreparation;
import java.util.*;
public class ListOfDepths {
 
   private static int min=Integer.MAX_VALUE;
   private static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	 Node root=null;
	 root = createTree(root,a,0);
	 
	 
	 // check if binary tree is balance binary tree or not
//	 String ans=isBalanced(root)?"Tree is balance binary tree":"Tree is not balance binary tree";
//	 System.out.println(ans);
	 
	 
	 // check if BT is BST or not
     	
	 String ans=checkBST(root,min,max)?"BT is BST":"BT is not BST";
	 System.out.println(ans);
	 
	 // convert BT to linkedlist level by level ...
//	 LinkedList<LinkedList<Node>>head=new LinkedList<>();
//	 head=listOfDepths(root,head);
//	 for(int i=0;i<head.size();i++) {
//		 System.out.print("level "+i+"--> "+"(");
//		 for(Node temp:head.get(i)) {
//			 System.out.print(" "+temp.data);
//		 }
//		 System.out.println(" )");
//	 }
	}
    private static boolean checkBST(Node root,int min,int max) {
	 if(root==null)return true;
	 if(min!=Integer.MAX_VALUE&&root.data<=min||max!=Integer.MIN_VALUE&&root.data>max)
	 if(!checkBST(root.left,min,root.data)||!checkBST(root.right,root.data,max))return false;
  return true;  
	}

//	private static int min=Integer.MIN_VALUE;
//	private static boolean isBalanced(Node root) {
//		return checkHeight(root)!=min;
//	}
//
//
//	private static int checkHeight(Node root) {
//		if(root==null)return -1;
//		int left=checkHeight(root.left);
//		if(left==min)return min;
//		int right=checkHeight(root.right);
//		if(right==min)return min;
//		int diff=Math.abs(left-right);
//		if(diff>1)return min;
//		return Math.max(left, right)+1;
//	}


	private static LinkedList<LinkedList<Node>> listOfDepths(Node root, LinkedList<LinkedList<Node>> head) {
	    
		LinkedList<Node>curr=new LinkedList<>();
		if(root!=null)curr.add(root);
		while(curr.size()>0) {
			head.add(curr);
			LinkedList<Node>parents=new LinkedList<>();
			parents=curr;
			curr=new LinkedList<>();
			for(Node e:parents) {
			   if(e.left!=null)curr.add(e.left);
			   if(e.right!=null)curr.add(e.right);
			}
		}
		return head;
	}


	private static Node createTree(Node root,int[]a,int i) {
		if(i<a.length) {
			Node temp=new Node(a[i]);
			root=temp;
			root.left=createTree(root.left,a,2*i+1);
			root.right=createTree(root.right,a,2*i+2);
		}
		return root;
  }
}