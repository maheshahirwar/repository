package DataStructureFramework.graphs;
import java.util.*;

class Graphs{
	int vertices;
	int edges;
	List<List<Integer>>matrix;
	Graphs(int vertices, int edges){
		this.vertices=vertices;
		this.edges=edges;
		matrix=new LinkedList<>();
		for(int i=0; i<vertices; i++) {
			matrix.add(new LinkedList<>());
		}
	}
}

public class AdjacencyListGraph {

	public static void main(String[] args) {
     int noOfVertices=5;
     int noOfEdges=7;
     List<int[]>edges=new LinkedList<>();
     edges.add(new int[] {0,1});
     edges.add(new int[] {1,2});
     edges.add(new int[] {1,3});
     edges.add(new int[] {2,1});
     edges.add(new int[] {3,4});
     edges.add(new int[] {4,1});
     edges.add(new int[] {4,2});
     Graphs graph=new Graphs(noOfVertices,noOfEdges);
     for(int i=0; i<edges.size();i++) {
     int[]edge=edges.get(i);
     graph.matrix.get(edge[0]).add(edge[1]);
	}
     for(int v=0; v<noOfVertices; v++) {
    	 System.out.print("Node "+v+" -> ");
    	 for(Integer dest:graph.matrix.get(v)) {
    		 System.out.print(dest+",");
    	 }
    	 System.out.println();
     }
	}
}
