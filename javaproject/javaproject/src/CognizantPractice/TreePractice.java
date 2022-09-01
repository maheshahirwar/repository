package CognizantPractice;
import java.util.*;
public class TreePractice {
   private static Scanner sc;
	public static void main(String[] args) {
		//binary Tree
		Node root=null;
		root=createTree();
		System.out.println("Preorder traversal :");
		preorder(root);
		System.out.println("Inorder traversal : ");
		inorder(root);
		System.out.println("Postorder traversal : ");
		postorder(root);
		
		//BST 
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		//int[]a=new int[n];
//		Node root=null;
//		for(int i=0;i<n;i++) {
//			int x=sc.nextInt();
//		root= insert(root,x);
//		}
//		preorder(root);
//		System.out.println();
//		inorder(root);
//		System.out.println();
//		postorder(root);
	}
//	//bst 
//	static Node insert(Node root,int data) {
//	 if(root==null) {
//		 root=getNewNode(data);
//	 }
//	 else if(data<=root.data) {
//		root.left= insert(root.left,data);
//	 }else {
//		root.right= insert(root.right,data);
//	 }
//	 return root;
//	}
//	static Node getNewNode(int data) {
//		Node newNode=new Node(data);
//		newNode.data=data;
//		newNode.left=newNode.right=null;
//		return newNode;
//	}
       // binary tree
	
static Node createTree() {
    System.out.println("Enter data : ");
    sc= new Scanner(System.in);
    int data=sc.nextInt();
    if(data==-1) {
    	return null;
    }
    Node root=null;
    root=new Node(data);
    System.out.println("Enter  for left : "+data);
    root.left=createTree();
    System.out.println("Enter  for right : "+data);
    root.right=createTree();
    return root;
}
	
// traversal 	
static void preorder(Node root) {
	if(root==null)return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
static void inorder(Node root) {
	if(root==null)return;
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}
static void postorder(Node root) {
	if(root==null)return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+" ");
}
}
