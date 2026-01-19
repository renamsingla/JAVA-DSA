package Recursion2;

public class r18_Permutation {
	
	public static void recursion(String str, String ans ) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			recursion(str.substring(0,i)+str.substring(i+1),ans+ch);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abc";
		recursion(str,"");

	}

}
