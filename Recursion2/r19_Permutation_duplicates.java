package Recursion2;

public class r19_Permutation_duplicates {

	public static void permutation (String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			boolean val=true;
			for(int j=i+1;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					val=false;
					break;
				}
			}
			if(val==false) {
				continue;
			}
			String s1= str.substring(0,i);
			String s2= str.substring(i+1);
			permutation(s1+s2, ans+ch);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abca";
		permutation(str,"");

	}

}
