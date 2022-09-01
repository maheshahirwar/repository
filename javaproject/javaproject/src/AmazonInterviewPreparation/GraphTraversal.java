package AmazonInterviewPreparation;
import java.util.*;
public class GraphTraversal {
	static LinkedList<Integer>adj[];
    GraphTraversal(int v){
    	adj=new LinkedList[v];
    	for(int i=0;i<v;i++) {
    		adj[i]=new LinkedList<>();
    	}
    }
    
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int vertex=sc.nextInt();
	int edge=sc.nextInt();
	GraphTraversal graph=new GraphTraversal(vertex);
	for(int i=0;i<edge;i++) {
		int s=sc.nextInt();
		int d=sc.nextInt();
		addEdge(s,d);
	}
	for(int i=0;i<adj.length;i++) {
		System.out.println(i+"-->"+adj[i]);
	}
	int source=sc.nextInt();
	int destination=sc.nextInt();
	String isPossible=bfs(source,destination)?"Possible":"Not possible";
	System.out.println("bfs--> "+isPossible);
	 isPossible=dfs(source,destination)?"Possible":"Not possible";
	System.out.println("dfs--> "+isPossible);
	
	}

	private static boolean dfs(int source, int destination) {
		boolean[]vis=new boolean[adj.length];
		Stack<Integer>s=new Stack<>();
		vis[source]=true;
		s.push(source);
		while(!s.empty()) {
			int curr=s.pop();
			System.out.print(curr+"--> ");
			if(curr==destination)return true;
			for(int i:adj[curr]) {
				if(vis[i]==false) {
					vis[i]=true;
					s.push(i);
				}
			}
		}
		return false;
	}

	private static boolean bfs(int source, int destination) {
	Queue<Integer>q=new LinkedList<>();
	boolean[]vis=new boolean[adj.length];
	q.add(source);
	vis[source]=true;
	while(!q.isEmpty()) {
		int curr=q.poll();
		System.out.print(curr+"--> ");
		if(curr==destination)return true;
		for(int i:adj[curr]) {
			if(vis[i]==false) {
				vis[i]=true;
				q.add(i);
			}
		}
	}
	return false;
	}

	private static void addEdge(int s, int d) {
	adj[s].add(d);
	adj[d].add(s);
	}

}
