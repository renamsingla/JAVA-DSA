package Practice_Graph;

public class undir_graph_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impl_undir_graph ug= new Impl_undir_graph(4);
		
		ug.AddEdge(1, 2);
		ug.AddEdge(1, 4);
		ug.AddEdge(2, 3);
		ug.AddEdge(3, 4);
		
		ug.display();
	}

}
