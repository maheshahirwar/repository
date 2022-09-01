package DataStructureFramework.graphs;

import java.util.LinkedList;
import java.util.Scanner;

public class DfsGraphTraversal {
     
	LinkedList<Integer>adj[];
	public DfsGraphTraversal(int v) {
		adj=new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i]=new LinkedList<Integer>();
		} 
	}
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
public boolean dfsUtil(int source, int destination,boolean vis[]) {
	if(source==destination) return true;
	
	for(int neighbour:adj[source]) {
		if(!vis[neighbour]) {
			vis[neighbour]=true;
			boolean isConnected=dfsUtil(neighbour,destination,vis);
			if(isConnected)return true;
		}
	}
	return false;
}
public boolean dfs(int source, int destination) {
	boolean vis[]=new boolean[adj.length];
	vis[source]=true;
	return dfsUtil(source,destination,vis);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of vertices and edges");
		int v=sc.nextInt();
		int e=sc.nextInt();
		DfsGraphTraversal graph=new DfsGraphTraversal(v);
		System.out.println("Enter "+e+" edges");
		for(int i=0; i<e; i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdge(source, destination);
		}
		System.out.println("Enter source and destination");
		int source=sc.nextInt();
		int destination=sc.nextInt();
         System.out.println(graph.dfs(source,destination));
	}

}
