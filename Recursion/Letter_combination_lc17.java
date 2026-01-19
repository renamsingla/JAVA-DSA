package Recursion;

public class Letter_combination_lc17 {
	static String[] map= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void combination(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return; 
		}
		
		char ch= str.charAt(0);
		int n= ch-'0';
		for(int i=0;i<map[n].length();i++) {
			char c= map[n].charAt(i);
			combination(str.substring(1),ans+c);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="23";
		combination(str,"");

	}

}
