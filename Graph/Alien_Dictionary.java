package Graph;

import java.util.*;

public class Alien_Dictionary {
	
	  static HashMap<Character, List<Character>> map= new HashMap<>();
	 
	  int[]InDegree= new int[27];
	
	public String AlienOrder(String[]words) {
		
		for(int i=0;i<words.length;i++) {
			String w= words[i];
			
//			for(char ch: words[i].toCharArray()) {
//				
//			}
			
			for(int j=0;j<w.length();j++){
				char ch= w.charAt(j);
				if(!map.containsKey(ch)) {
					map.put(ch,new ArrayList<>());
				}
			}
		}
		
		for(int i=0;i<words.length-1;i++) {
			String w1= words[i];
			String w2= words[i+1];
			
			if(w1.startsWith(w2) && w1.length()>w2.length()) {
				return "";
			}
			
			for(int j=0;j<Math.min(w1.length(),w2.length()) ;j++) {
				if(w1.charAt(j)!=w2.charAt(j)) {
					List<Character>nbrs= map.get(w1.charAt(j));
					if(!nbrs.contains(w2.charAt(j))) {
						
						map.get(w1.charAt(j)).add(w2.charAt(j));
						InDegree[w2.charAt(j)-'a']++;
					}
					break;
				}
			}
		}
		
		Queue<Character>q= new LinkedList<>();
		
		for(Character key: map.keySet()){
			if (InDegree[key-'a']==0) {
				q.add(key);
			}
		}
		
		StringBuilder sb= new StringBuilder();
		
		while(!q.isEmpty()) {
			char item= q.poll();
			sb=sb.append(item);
			
			for(char nbrs: map.get(item)) {
				InDegree[nbrs-'a']--;
				if(InDegree[nbrs-'a']==0) {
					q.add(nbrs);
				}
			}
			
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] words= {"wrt", "wrf", "er","ett", "rftt"};
//		String[] words= {"ac", "ab", "zc","zb"};
		String[] words= {"abc", "ab"};
	
		Alien_Dictionary ad= new Alien_Dictionary();
		 String str= ad.AlienOrder(words);
		 
		 if(str.length()!=map.size()) {
			 System.out.println("answer not possible");
		 }else {
			 for(int i=0;i<str.length();i++) {
				 char ch= str.charAt(i);
				 System.out.print(ch+",");
			 }
		 }
	}

}
