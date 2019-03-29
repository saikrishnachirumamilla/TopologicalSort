package graphdfs;

import java.util.LinkedList;
import java.util.Stack;

public class GraphDFS {
	private Integer vertices;
	private LinkedList<Integer> adjacentList[];
	private int adjacencyMatrix[][];
	private int[] previousEdge;
	private Stack<Integer> cycleStack;
	private boolean isCyclic;
	
	public boolean isCyclic() {
		return isCyclic;
	}

	public void setCyclic(boolean isCyclic) {
		this.isCyclic = isCyclic;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GraphDFS(Integer vertices) {
		this.vertices = vertices;
		adjacentList = new LinkedList[vertices];
		adjacencyMatrix = new int [vertices][vertices];
		for (int i = 0; i < vertices; i++) {
			adjacentList[i] = new LinkedList();
		}
	}

	public Integer getVertices() {
		return vertices;
	}

	public void setVertices(Integer vertices) {
		this.vertices = vertices;
	}

	public LinkedList<Integer>[] getAdjacentList() {
		return adjacentList;
	}

	public void setAdjacentList(LinkedList<Integer>[] adjacentList) {
		this.adjacentList = adjacentList;
	}
	
	public void addEdge(int source, int destination) {
		 adjacentList[source].add(destination);
		 adjacencyMatrix[source][destination]=1;

    }
		
	public void dfs(Integer node, boolean visitedNodes[], boolean pushedToStack[], Stack<Integer> stack, int parent) {
		
		pushedToStack[node] = true;
		visitedNodes[node] = true;
		
		for (int vertex: adjacentList[node]) {
			if (cycleStack != null) {
				return;
			}else if (!visitedNodes[vertex] && adjacencyMatrix[node][vertex] == 1){
				previousEdge[vertex] = node;
				dfs(vertex,visitedNodes,pushedToStack, stack, node);
			}else if(pushedToStack[vertex]) {
				isCyclic = true;
				cycleStack = new Stack<Integer>();
				for (int j = node; j != vertex; j = previousEdge[j]) {
					cycleStack.push(j);
              }
				cycleStack.push(vertex);
				cycleStack.push(node);
			}
		}
		pushedToStack[node] = false;
        stack.push(node);
	}
	
	public void topologicalSort(GraphDFS graph, int nodes) {
		
		boolean visitedNodes[] = new boolean[nodes];
		boolean pushedToStack[] = new boolean[nodes];
		previousEdge = new int[nodes];
		Stack<Integer> stack= new Stack<Integer>();
		
		for (int i = 0; i < nodes; i++) {
			int startingNode = i;
			if (!visitedNodes[startingNode] && cycleStack == null) {
				graph.dfs(startingNode, visitedNodes, pushedToStack, stack, startingNode);
			}

		}
		
		if(this.isCyclic) {
          System.out.print("Cycle Detected: ");
          int stackSize = cycleStack.size();
	        for (int i = 0; i < stackSize; i++) {
	            System.out.print(cycleStack.pop() + " ");
	        }
          System.out.println();
		}else {
			int stackSize = stack.size();
			System.out.print("Topological Sort: ");
	        for (int i = 0; i < stackSize; i++) {
	            System.out.print(stack.pop() + " ");
	        }
	        System.out.println("");
		}
			
	}
}
