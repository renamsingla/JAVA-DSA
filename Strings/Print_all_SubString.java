package Strings;

public class Print_all_SubString {
	
	public static void substring(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				s=str.substring(i,j);
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "hello";
		substring(str);

	}

}
