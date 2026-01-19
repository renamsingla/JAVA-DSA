package Set;

import java.util.LinkedHashSet;

public class LinkedHashSet_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set= new LinkedHashSet<>();  //O(log n)
		//preserve insertion order
		
		set.add(10);
		set.add(22);
		set.add(3);
		set.add(-9);
		set.add(100);
		set.add(35);
		set.add(69);
		
		System.out.println(set); //sorted order 
		
		System.out.println(set.contains(22));
		System.out.println(set.contains(90));
		
		System.out.println(set.remove(100));
		
		System.out.println(set);
		
		for(Integer val:set) {
			 System.out.print(val+" ");
		} 

	}

}
