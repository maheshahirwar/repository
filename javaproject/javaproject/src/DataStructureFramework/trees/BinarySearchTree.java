package DataStructureFramework.trees;
import java.util.*;
public class BinarySearchTree {
    
	public static void main(String[] args) {
      Node root=null;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			root=insert(root,a[i]);
		}
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
//        System.out.println();
      System.out.println("Enter any number be searched : ");
      int num=sc.nextInt();
      if(search(root,num)==true) {
    	  System.out.println("Found");
      }else {
    	  System.out.println("Not Found");
      }
      inOrder(root);
      System.out.println();
      selfOrder(root);
	}
  static Node insert(Node root,int data){
	
	  if(root==null) {
		  root=getNewNode(data);
	  }else if(data<=root.data) {
		  root.left=insert(root.left,data);
		 
	  }else {
		  root.right=insert(root.right,data);
		  
	  }
	  return root;
  }
 static Node getNewNode(int data) {
	  Node newNode=new Node(data);
	  newNode.data=data;
	  newNode.left=newNode.right=null;
	  return newNode;
  }
  static boolean search (Node root, int data) {
	 if(root==null)return false;
	 if(root.data==data)return true;
	 else if(data<=root.data)return search(root.left,data);
	 else return search(root.right,data);
 }
 static void inOrder(Node root) {
		if(root==null)return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
// static void preOrder(Node root) {
//		if(root==null)return;
//		System.out.print(root.data+" ");
//		preOrder(root.left);
//		preOrder(root.right);
//	}
// static void postOrder(Node root) {
//		if(root==null)return;
//		postOrder(root.left);
//		postOrder(root.right);
//		System.out.print(root.data+" ");
//	}
 static void selfOrder(Node root) {
	 if(root==null)return;
	 selfOrder(root.right);
	 System.out.print(root.data+" ");
	 selfOrder(root.left);
 }
 
}
