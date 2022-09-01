package algorithm.greedy;
import java.util.*;
public class Huffman_Coding {

	public static void main(String[] args) {
		String s="abcdef";
		int[]f= {5, 9, 12, 13, 16, 45};
		int n=6;
      System.out.println(huffmanCodes(s,f,n));
	}
	static ArrayList<String> huffmanCodes(String s,int[]f,int n){
		PriorityQueue<Node>q=new PriorityQueue<>(new Comparator<Node>() {
			public int compare(Node n1,Node n2) {
				return n1.freq-n2.freq;
			}
		});
		for(int i=0;i<n;i++) {
			q.add(new Node(f[i]));
		}
		while(q.size()>1) {
			Node first=q.poll();
			Node second=q.poll();
			Node root=new Node(first.freq+second.freq);
			root.left=first;
			root.right=second;
			q.add(root);
		}
		ArrayList<String>ans=new ArrayList<>();
		Node root=q.poll();
		preorder(root,"",ans);
		return ans;
	}
	
static void preorder(Node root,String str,ArrayList<String>ans) {
if(root.left==null&&root.right==null) {
	ans.add(str);
	return;
}
preorder(root.left,str+"0",ans);
preorder(root.right,str+"1",ans);
}
static class Node{
	int freq;
	Node left;
	Node right;
	Node(int freq){
		this.freq=freq;
		this.left=null;
		this.right=null;
	}
}

}
