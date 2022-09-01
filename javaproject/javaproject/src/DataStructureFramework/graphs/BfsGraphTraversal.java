package DataStructureFramework.graphs;
import java.util.*;
public class BfsGraphTraversal {
 LinkedList<Integer>adj[];
public BfsGraphTraversal(int v) {
	adj=new LinkedList[v];
	for(int i=0; i<v; i++) {
		adj[i]=new LinkedList<Integer>();
	}
}
public void addEdge(int source, int destination) {
	adj[source].add(destination);
	adj[destination].add(source);
	
}
public int bfs(int source,int destination) {
	boolean vis[]=new boolean[adj.length];
	int parent[]=new int[adj.length];
	Queue<Integer>q=new LinkedList<>();
	q.add(source);
	parent[source]=-1;
	vis[source]=true;
	while(!q.isEmpty()) {
		int cur=q.poll();
		if(cur==destination)break;
		for(int neighbour:adj[cur]) {
			if(!vis[neighbour]) {
				vis[neighbour]=true;
				q.add(neighbour);
				parent[neighbour]=cur;
			}
		}
	}
	int cur=destination;
	int distance=0;
	while(parent[cur]!=-1) {
		System.out.print(cur+"-> ");
		cur=parent[cur];
		distance++;
	}
	return distance;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of vertices and edges");
		int v=sc.nextInt();
		int e=sc.nextInt();
		BfsGraphTraversal graph=new BfsGraphTraversal(v);
		System.out.println("Enter "+e+" edges");
		for(int i=0; i<e; i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graph.addEdge(source, destination);
		}
		System.out.println("Enter source and destination");
		int source=sc.nextInt();
		int destination=sc.nextInt();
		System.out.println("minimum shorted path "+graph.bfs(source, destination));
//		for(int i=0; i<v; i++) {
//			System.out.print("Node "+i+"-> ");
//           for(int s:graph.adj[i]) {
//    	  System.out.print(s+", ");
//      }
//           System.out.println();
//	}
	}
       
}
