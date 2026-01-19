package Recursion2;

public class r07_PrintAllSubsequence {
	
	public static int subsequence(String str, String ans) {
		if(str.length()<=0) {
			System.out.println(ans);
			return 1;
		}
		char ch= str.charAt(0);
		int a= subsequence(str.substring(1),ans+ch);
		int b= subsequence(str.substring(1),ans);
		return a+b;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "abc";
		String ans="";
		int c= subsequence(str,ans);
		System.out.print(c);

	}

}
