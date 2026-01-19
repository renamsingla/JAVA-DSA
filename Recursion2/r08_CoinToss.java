package Recursion2;

public class r08_CoinToss {
	static int count=0;

	
	public static void toss (String ans, int n) {
		if(n==0) {
			System.out.println(ans);
			count++;
			return ;
		}

		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H' ) {
			toss(ans+'H',n-1);
		}
		toss(ans+'T', n-1);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		String ans="";
		toss(ans, n);
		System.out.println(count);

	}

}
