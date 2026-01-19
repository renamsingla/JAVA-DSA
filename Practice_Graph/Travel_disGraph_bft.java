package Practice_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Travel_disGraph_bft {
	
	HashMap<Integer, List<Integer>>map;
	
	public Travel_disGraph_bft(int n) {
		map= new HashMap<>();
		for(int i=1;i<=n;i++) {
			map.put(i,new ArrayList<>());
		}
	}
	
	public void AddEdge(int v1, int v2) {
		map.get(v1).add(v2);
		map.get(v2).add(v1);
	}
	
	public void display() {
		for(int key: map.keySet()) {
			System.out.println(key+" -"+ map.get(key));
		}
	}
	
	public HashMap<String,String> traversal() {
		HashSet<Integer>visited= new HashSet<>();
		Queue<Integer>q= new LinkedList<>();
		String str="";
		int component=0;
		int cycle= 0;
		for(int key: map.keySet()) {
			if(visited.contains(key)) {
				continue;
			}
			q.add(key);
			component=component+1;
			while(!q.isEmpty()) {
				int item= q.poll();
				
				if(visited.contains(item)) {
					cycle++;
					continue;
				}
				
				visited.add(item);
				
				str+=item;
				
				for(int nbr: map.get(item)) {
					if(!visited.contains(nbr)) {
						q.add(nbr);
					}
				}
				
			}
		}
//		System.out.println(cycle);
		char cy= (char)(cycle+'0');
//		System.out.println(component);
		char co=(char)(component+'0');
		
		String ans="";
		
		HashMap<String,String>result=new HashMap<>();
		result.put("path", str);
		result.put("cycle",ans+cy );
		result.put("component", ans+co);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel_disGraph_bft bft= new Travel_disGraph_bft(8);
		
		bft.AddEdge(1, 2);
		bft.AddEdge(2, 3);
		bft.AddEdge(3, 4);
		bft.AddEdge(4, 1);
		bft.AddEdge(5, 6);
		bft.AddEdge(5, 7);
		bft.AddEdge(6, 7);
		
		bft.display();
		
		System.out.println(bft.traversal());
		

	}

}
