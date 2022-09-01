package AmazonInterviewPreparation;
import java.util.*;
public class M_Coloring_Problem {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int e=sc.nextInt();
	MyGraph graph=new MyGraph(n);
	for(int i=0;i<e;i++) {
		int source=sc.nextInt();
		int destination=sc.nextInt();
		graph.addEdge(source, destination);
	}
	
	int[]color=new int[n];
	graphColoring(graph.adj,color,0,n,m);
	for(int it:color) {
		System.out.print(it+" ");
	}
	}
public static boolean graphColoring(LinkedList<Integer>[]graph,int[]color,int node,int n,int m) {
	if(node==n)return true;
	for(int i=1;i<=m;i++) {
		if(isPossible(graph,color,node,i)) {
			color[node]=i;
			if(graphColoring(graph,color,node+1,n,m))return true;
			color[node]=0;
		}
	}
	return false;
}
public static boolean isPossible(LinkedList<Integer>[]graph,int[]color,int node,int val) {
	for(int item:graph[node]) {
		if(color[item]==val)return false;
	}
	return true;
}
}
class MyGraph{
	 LinkedList<Integer>[]adj;
	MyGraph(int val){
		adj=new LinkedList[val];
		for(int i=0;i<val;i++) {
			adj[i]=new LinkedList<>();
		}
	}
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
}