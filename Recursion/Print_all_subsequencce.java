package Recursion;

public class Print_all_subsequencce {
	public static void subseq(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch= str.charAt(0);
		
		subseq(str.substring(1),ans);
		subseq(str.substring(1), ans+ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abc";
		subseq(str, "");

	}

}
