package Recursion;

public class permutation_string {
	public static int permutation(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return 1;
		}
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			String s1=str.substring(0,i);
			String s2=str.substring(i+1);
			count+= permutation(s1+s2,ans+ch);
		
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		int c=  permutation(str,"");
		System.out.println(c);

	}

}
