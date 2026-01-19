package Hashmap;

import java.util.*;

public class Treemap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <String, Integer> hm= new TreeMap<>(); //O( log n)
//		null as key not allowed- because while sorting null cannot use compareTo method
		
		hm.put("raj",20);
		hm.put("rani",30);
		hm.put("pooja",26);
		hm.put("kaju",77);
		hm.put("piya",80);
		
		System.out.println(hm); //key wise sorted map

	}

}
