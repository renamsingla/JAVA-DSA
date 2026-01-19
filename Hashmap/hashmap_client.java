package Hashmap;

public class hashmap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashmap_class <String,Integer> hm= new hashmap_class<>();
		
		hm.put("raj",20);
		hm.put("rani",30);
		hm.put("pooja",26);
		hm.put("kaju",77);
		hm.put("piya",80);
//		hm.put(null, 30);
		hm.put("pooja",38);
		
		System.out.println(hm.get("pooja"));
		System.out.println(hm.get("kaju"));
		
		System.out.println(hm); 
		

	}

}
