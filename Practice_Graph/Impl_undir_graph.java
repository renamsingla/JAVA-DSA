package Practice_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Impl_undir_graph {
//	creating the hash-map
	HashMap<Integer, List<Integer>> map;
	
//	constructor of the class that will take the number of vertex in the graph 
	public Impl_undir_graph(int n) {
		map= new HashMap<>(); //map will be initialised after the n is given
		for(int i=1;i<=n;i++) {
			map.put(i,new ArrayList<>()); //here we are putting the keys, next to a null list
		}
	}
	
//	add neighbours to each vertex- showing edge exists
	public void AddEdge(int v1, int v2) {
//		here v1 is the key and v2 is the vertex with which edge exists that will be the neighbour
		map.get(v1).add(v2);
		map.get(v2).add(v1); 
		//since undirected graph- both will be each others neighbour
	}
	
	public void display() {
		for(int key: map.keySet()) {
				System.out.println(key+" -"+map.get(key)+" "); //map.get(key) returns a list
		}
	}

}
