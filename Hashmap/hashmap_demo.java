package Hashmap;

import java.util.*;

public class hashmap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map <String, Integer> hm= new HashMap<>();   //here Map is an interface just like list
		
		HashMap <String, Integer> hm= new HashMap<>();  //O(1)
//                 key, value pair
		hm.put("raj",20);
		hm.put("rani",30);
		hm.put("pooja",26);
		hm.put("kaju",77);
		hm.put("piya",80);
		hm.put(null, 30);
		
		System.out.println(hm); 
		//order of data is random, hence insertion order is not preserved because O(1)
		
//		to check whether there is a key or not
		System.out.println(hm.containsKey("rani"));
		System.out.println(hm.containsValue(77));
		
//		remove
		System.out.println(hm.remove("ayush")); //null- it is not there in hash-map
		System.out.println(hm.remove("rani"));
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		Set<String>set= hm.keySet();
//		loop on set
		for(String val: set) {
			System.out.println(val+" "+ hm.get(val));
		}
		
//		or we can do-
//		since ketSet is a set, we can directly iterate on the method
		
		for(String key: hm.keySet()){
			System.out.println(key+" "+ hm.get(key));
		}
		
	}

}
