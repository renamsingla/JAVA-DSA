package Graph;

import java.util.*;

public class BellMan_ford_algo {
	HashMap<Integer, HashMap<Integer,Integer>>map;
	
	public BellMan_ford_algo(int v) {
		map= new HashMap<>();
		
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2,cost);
	}
	
	class EdgePair{
		int e1;
		int e2;
		int cost;
		
		public EdgePair(int e1, int e2, int cost) {
			this.e1= e1;
			this.e2= e2;
			this.cost=cost;
		}
	}
	
	public List<EdgePair> getAllEdge(){
		List<EdgePair> ll= new ArrayList<>();
		
		for(int e1:map.keySet()) {
			for(int e2: map.get(e1).keySet()) {
				int cost= map.get(e1).get(e2);
				ll.add(new EdgePair(e1,e2,cost));
			}
		}
		return ll;
	}
	
	public void bellman() {
		int v= map.size(); //1 base indexing
		
		int[]dist= new int[v+1];
		
		for(int i=2;i<dist.length;i++) {
			dist[i]=9999; //to not get overflow error we are not taking max value of integer
		}
		
		List<EdgePair> ll= getAllEdge();
		
		for(int i=1;i<=v;i++) { //no of times relaxed
			
			for(EdgePair e: ll) { //for for each edge 
				
				if(i==v && dist[e.e2]>dist[e.e1]+e.cost) {
					System.out.println("contains -ve weight cycle");
					return;
				}
				if(dist[e.e2]>dist[e.e1]+e.cost) {
					dist[e.e2]=dist[e.e1]+e.cost;
				}
			}
		}
		
		for(int i=1;i<dist.length;i++) {
			System.out.print(dist[i]+" ");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s= new Scanner(System.in);
//		int n= s.nextInt();
//		BellMan_ford_algo bmf= new BellMan_ford_algo(n);
//		
//		int m= s.nextInt();
//		for(int i=1;i<=n;i++) {
//			int e1=s.nextInt();
//			int e2= s.nextInt();
//			int cost= s.nextInt();
//			bmf.AddEdge(e1, e2, cost);
//		}
		
		BellMan_ford_algo bfd = new BellMan_ford_algo(5);
		bfd.AddEdge(1, 2, 8);
//		bfd.AddEdge(2, 5, -2);
		bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, 1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		
//		bmf.bellman();
		bfd.bellman();
	}

}
