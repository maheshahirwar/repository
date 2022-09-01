package CognizantPractice;
import java.util.*;
public class TreeQuestion {
    
	public static void main(String[] args) {
	int[]a= {1,2,3,4,5,6};	
     int target=5;
     Node root=null;
      root=insert(a,root,0);
     Set<Integer>set=levelOrder(root,target);
     set.remove(target);
     System.out.println(set);
	}
	static Node insert(int[]a,Node root, int i) {
		if(i<a.length) {
		Node temp=new Node(a[i]);
		root=temp;
		root.left=insert(a,root.left,2*i+1);
		root.right=insert(a,root.right,2*i+2);
		}
		return root;
	}
	static Set<Integer> levelOrder(Node root, int target){
		if(root==null)return null;
		Queue<Node>q=new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			Set<Integer>set=new HashSet<>();
			int size=q.size();
			for(int i=0;i<size;i++) {
				Node child=q.poll();
				set.add(child.data);
				if(child.left!=null) {
					q.offer(child.left);
				}
				if(child.right!=null) {
					q.offer(child.right);
				}
			}
			if(set.contains(target)) {
				return set;
			}
		}
		return null;
	}

}
class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}