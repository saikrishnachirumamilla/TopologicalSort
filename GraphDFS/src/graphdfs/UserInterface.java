package graphdfs;

public class UserInterface {
	public static void main(String[] args) {
		int nodes = 8;
		GraphDFS graph = new GraphDFS(nodes);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(0, 6);
		graph.addEdge(2, 5);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
		graph.addEdge(4, 6);
		graph.addEdge(5, 6);
		graph.addEdge(6, 7);
		System.out.print("Graph 1 ");
		graph.topologicalSort(graph, nodes);
		
		
		int nodes1 = 8;
		GraphDFS graph1 = new GraphDFS(nodes1);
		graph1.addEdge(0, 1);
		graph1.addEdge(0, 2);
		graph1.addEdge(0, 3);
		graph1.addEdge(0, 6);
		graph1.addEdge(2, 5);
		graph1.addEdge(4, 3);
		graph1.addEdge(3, 5);
		graph1.addEdge(5, 4);
		graph1.addEdge(4, 6);
		graph1.addEdge(5, 6);
		graph1.addEdge(6, 7);
		System.out.print("Graph 2 ");
		graph1.topologicalSort(graph1, nodes1);
		
		int nodes2 = 11;
		GraphDFS graph2 = new GraphDFS(nodes2);
		graph2.addEdge(0,1);
		graph2.addEdge(0,5);
		graph2.addEdge(1,2);
		graph2.addEdge(1,3);
		graph2.addEdge(1,5);
		graph2.addEdge(2,4);
		graph2.addEdge(4,3);
		graph2.addEdge(5,6);
		graph2.addEdge(6,8);
		graph2.addEdge(7,8);
		graph2.addEdge(7,3);
		graph2.addEdge(8,10);
		graph2.addEdge(9,7);
		graph2.addEdge(9,10);
		graph2.addEdge(9,4);
		System.out.print("Graph 3 ");
		graph2.topologicalSort(graph2, nodes2);
		
		
		int nodes3 = 11;
		GraphDFS graph3 = new GraphDFS(nodes3);
		graph3.addEdge(0,1);
		graph3.addEdge(0,5);
		graph3.addEdge(1,2);
		graph3.addEdge(1,3);
		graph3.addEdge(1,5);
		graph3.addEdge(2,4);
		graph3.addEdge(3,4);
		graph3.addEdge(5,6);
		graph3.addEdge(6,8);
		graph3.addEdge(7,8);
		graph3.addEdge(7,3);
		graph3.addEdge(8,10);
		graph3.addEdge(9,7);
		graph3.addEdge(9,10);
		graph3.addEdge(4,9);
		System.out.print("Graph 4 ");
		graph3.topologicalSort(graph3, nodes3);
		
	}

}
