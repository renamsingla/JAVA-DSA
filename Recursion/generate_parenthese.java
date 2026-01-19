package Recursion;

import java.util.ArrayList;
import java.util.List;

public class generate_parenthese {
	 public static void parentheses(int n, String str, int open, int close, List<String>l){
	        if(open>n || close>n){
	            return;
	        }
	        if(close>open){
	            return;
	        }
	        if(open==n && close==n){
	        	l.add(str);
//	        	System.out.println(str);
	            return;
	        }
	        parentheses(n,str+"(", open+1,close,l);
	        if(str!=""){
	            parentheses(n,str+")", open, close+1,l);
	        }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> l= new ArrayList<>();
		parentheses(n,"",0,0,l);
		System.out.println(l);

	}

}
