package Graph;

import java.util.HashSet;

public class graph_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g= new graph(7);
		
//		g.addEdge(1, 4, 5);
		g.addEdge(1, 2, 3);
//		g.addEdge(2, 1, 3);
		g.addEdge(2, 3, 4);
		g.addEdge(3, 2, 4);
		g.addEdge(3, 4, 2);
		g.addEdge(4, 1, 5);
		g.addEdge(4, 3, 2);
		g.addEdge(4, 5, 6);
		g.addEdge(5, 4, 6);
		g.addEdge(5, 6, 1);
		g.addEdge(5, 7, 8);
		g.addEdge(6, 5, 1);
		g.addEdge(6, 7, 4);
		g.addEdge(7, 6, 4);
		g.addEdge(7, 5, 8);
		
		g.display();
		
		System.out.println(g.hasPath(1, 7, new HashSet<>()));
		
		g.printPath(1, 7, new HashSet<>(), "");
		
		System.out.println(g.BFS(1, 5));
		System.out.println(g.DFS(1, 5));
	}

}
