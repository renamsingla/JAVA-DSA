package Hashmap;

import java.util.LinkedHashMap;

public class LinkedHashMap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <String, Integer> hm= new LinkedHashMap<>(); //O(1)
		
//		data is added in the same order as it is "put"

		hm.put("raj",20);
		hm.put("rani",30);
		hm.put("pooja",26);
		hm.put("kaju",77);
		hm.put("piya",80);
		hm.put(null,22); //		null can also be put in linked hash-map
		
		System.out.println(hm);

	}

}
