package Recursion;

public class permutation_stringII {
	public static void permutation(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return ;
		}
		

		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			boolean exist= false; 
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(j)==ch) {
					exist= true;
					break;
				}
			}
			if(exist==false) {
			String s1=str.substring(0,i);
			String s2=str.substring(i+1);
			permutation(s1+s2,ans+ch);
			}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abcaa";
		permutation(str,"");
		

	}

}
