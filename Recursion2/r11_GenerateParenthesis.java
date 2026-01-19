package Recursion2;

import java.util.ArrayList;

public class r11_GenerateParenthesis {
	
	public static void parenthesis(String str,int open, int close, int n) {
		if(open==n && close==n) {
			System.out.println(str);
			return;
		}
		if(close>open) {
			return;
		}
		if(open>n || close>n) {
			return;
		}
		
		parenthesis(str+'(',open+1,close,n);
		parenthesis(str+')',open,close+1,n);
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		parenthesis("",0,0,n);

	}

}
