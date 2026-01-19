package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Partition_of_a_string {
	
	public static boolean ispalidrom(String s) {
		int j=0;
		int k=s.length()-1;
		while(k>j) {
			if(s.charAt(j)!=s.charAt(k)) {
				return false;
			}
			j++;
			k--;
		}
		return true;
	}
	
	public static void partition(String str, List<String>ls, List<List<String>> ans) {
		
		
		if(str.length()==0) {
			ans.add(new ArrayList(ls));
			//System.out.println(ans);
			return;
		}
		for(int i=1;i<=str.length();i++) {
			String s= str.substring(0,i);
		    if(ispalidrom(s)) {
		    	ls.add(s);
			partition(str.substring(i), ls, ans);
			ls.remove(ls.size()-1); //backtracking
		    }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "NITIN";
		List<String>ls= new ArrayList<>();
		List<List<String>> ans= new ArrayList<>();
		partition(str,ls, ans);
		System.out.println(ans);

	}

}
