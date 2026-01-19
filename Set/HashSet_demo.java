package Set;

import java.util.HashSet;

public class HashSet_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> set= new HashSet<>();  //O(1)
		
		set.add(10);
		set.add(22);
		set.add(3);
		set.add(-9);
		set.add(100);
		set.add(35);
		set.add(69);
		
		System.out.println(set);
		
		System.out.println(set.contains(22));
		System.out.println(set.contains(90));
		
		System.out.println(set.remove(100));
		
		System.out.println(set);
		
		for(Integer val:set) {
			 System.out.print(val+" ");
		}
	}

}
