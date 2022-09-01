package DataStructureFramework.graphs;

import java.util.*;

class Graph{
	int vertics;
	int edges;
	int[][]matrix;
	Graph(int vertics,int edges){
		this.vertics=vertics;
		this.edges=edges;
		matrix= new int[vertics][vertics];
	}
}

public class AdjecencyMatrixGraph {

	public static void main(String[] args) {
	int noOfVertices=5;
	int noOfEdges=5;
	List<int[]>edges=new ArrayList<>();
	edges.add(new int[] {0,1});
	edges.add(new int[] {1,3});
	edges.add(new int[] {2,1});
	edges.add(new int[] {3,4});
	edges.add(new int[] {4,2});
	Graph graph=new Graph(noOfVertices,noOfEdges);
	for(int i=0; i<edges.size(); i++) {
		int []edge=edges.get(i);
		graph.matrix[edge[0]][edge[1]]=1;
	}
	for(int[]i:graph.matrix) {
		System.out.println(Arrays.toString(i));
	}
	}

}
