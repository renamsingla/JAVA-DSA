package Graph;

import java.util.*;

public class Kruskal_algo {
	
	HashMap<Integer,HashMap<Integer,Integer>>map;
	
	public Kruskal_algo(int v) {
		map=new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i,new HashMap<>());
		}
	}
	
	public void addEdge( int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
//	find all the edges and store it in increasing sorted way
//	so we can apply kruskal's algorithm
	class EdgePair{
		int e1;
		int e2;
		int cost;
		
		public EdgePair(int e1, int e2, int cost) {
			this.e1= e1;
			this.e2= e2;
			this.cost= cost;
		}
		
		public String toString() {
			return e1+"-"+e2+"@"+cost;
		}
	}
	
	public List<EdgePair> getAllEdges(){
		List<EdgePair> ll= new ArrayList<>();
		
		for(int e1: map.keySet()) {
			for(int e2: map.get(e1).keySet()) {
				int cost= map.get(e1).get(e2);
				
				ll.add(new EdgePair(e1, e2, cost));
			}
		}
//		 unsorted and duplicate list
		return ll;
	}
	
//	minimum cost
	public int kruskal() {
		
		List<EdgePair>ll = getAllEdges();
		
		Collections.sort(ll, new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return o1.cost- o2.cost;
			}
			
		});
		
//		MINIMUM SPANNING TREE
		
		int sum=0;
		
		Disjoint_Set dsu= new Disjoint_Set();
		for(int v: map.keySet()) {
			dsu.createSet(v);
		}
		
		for(EdgePair e: ll) {
			int re1= dsu.findSet(e.e1);
			int re2= dsu.findSet(e.e2);
			if(re1==re2) {
//				their parent are same
//				hence do nothing
			}else {
				dsu.Union(re2, re1);
				sum+=e.cost;
//				System.out.println(e);
			}
		}
		return sum;
	}
	
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt(); //number of vertex;
		
		Kruskal_algo ka= new Kruskal_algo(n);
		
		int m= s.nextInt(); //number of edges
		
		for(int i=1;i<=m;i++) {
			int v1= s.nextInt();
			int v2= s.nextInt();
			int cost=s.nextInt();
			ka.addEdge(v1, v2, cost);
		}
		
		System.out.println(ka.kruskal());
	}

}
