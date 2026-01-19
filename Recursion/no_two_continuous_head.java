package Recursion;

public class no_two_continuous_head {
	public static void contihead(int n, String ans) {
//		if(ans.length()>=2) {
//			for(int i=0;i<ans.length()-1;i++) {
//				if(ans.charAt(i)=='H' && ans.charAt(i+1)=='H') {
//					return;
//				}
//			}
//		}
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		if(ans.length()==0  || ans.charAt(ans.length()-1)!='H'){
			contihead(n-1,ans+"H");
		}
		
		
		contihead(n-1, ans+"T");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		contihead(n,"");

	}

}
