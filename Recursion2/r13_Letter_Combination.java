package Recursion2;

public class r13_Letter_Combination {
	
	static String[]map= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void Combination(String str, String ans) {
		
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch= str.charAt(0);
		int n= ch-'0';
		for(int i=0;i<map[n].length();i++) {
			char l= map[n].charAt(i);
			Combination(str.substring(1), ans+l);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="456";
		
		Combination(str,"");
		
				

	}

}
