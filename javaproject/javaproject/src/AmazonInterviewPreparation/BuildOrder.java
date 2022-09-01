package AmazonInterviewPreparation;
/*

Build Order: You are given a list of projects and a list of dependencies (which is a list of pairs of 
projects, where the second project is dependent on the first project). All of a project's dependencies 
must be built before the project is. Find a build order that will allow the projects to be built. If there 
is no valid build order, return an error. 
EXAMPLE 
Input: 
projects: a, b, c, d, e, f 
dependencies: (a, d), (f, b), (b, d), (f, a), (d, c) 
Output: f, e, a, b, d, c

 */
import java.util.*;
public class BuildOrder {
	
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String[]projects=new String[n];
     for(int i=0;i<n;i++) {
    	 projects[i]=sc.next();
     }
     Graph graph=new Graph();
     int e=sc.nextInt();
     for(int i=0;i<e;i++) {
    	String source=sc.next();
    	String destination=sc.next();
    	graph.addEdge(source, destination);
     }
     for(Map.Entry<String , LinkedList<String>>entry:graph.getNodes().entrySet()) {
    	 System.out.println(entry.getKey()+"--> "+entry.getValue());
     }
     Stack<String>s=new Stack();
     HashMap<String,Boolean>vis=new HashMap<String,Boolean>();
     for(String project:projects) {
    	 if(!vis.containsKey(project)) {
    		 dfs(graph.getNodes(),s,vis,project);
    	 }
     }
     while(!s.empty()) {
    	 System.out.print(s.pop()+" ");
     }
	}
public static void dfs(HashMap<String, LinkedList<String>>map,Stack<String>s,HashMap<String,Boolean>vis,String source) {
	vis.put(source, true);
	if(map.containsKey(source)) {
	LinkedList<String>neighbor=map.get(source);
	for(String nbhr:neighbor) {
		if(!vis.containsKey(nbhr)) {
			dfs(map,s,vis,nbhr);
		}
	}
	}
	
	s.push(source);
}
	
}
class Graph{
	private HashMap<String,LinkedList<String>>map=new HashMap<>();
	
	public HashMap<String,LinkedList<String>> getNodes(){
		return map;
	}
	public void addEdge(String source,String destination) {
		if(!map.containsKey(source)) {
			LinkedList<String>temp=new LinkedList<>();
			temp.add(destination);
			map.put(source, temp);
		}else {
			LinkedList<String>temp=map.get(source);
			temp.add(destination);
			map.put(source, temp);
		}
//		if(!map.containsKey(destination)) {
//			LinkedList<String>temp=new LinkedList<>();
//			temp.add(source);
//			map.put(destination, temp);
//		}else {
//			LinkedList<String>temp=map.get(destination);
//			temp.add(source);
//			map.put(destination, temp);
//		}
	}
}