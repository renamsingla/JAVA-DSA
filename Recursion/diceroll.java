package Recursion;

public class diceroll {
	public static void dice(int n, String ans,int i) {
		
		if(n==0) {
			System.out.println(ans);
			return;
		}
		if(n<0) {
			return;
		}
		for(int diceno= 1;diceno<=i;diceno++) {
			dice(n-diceno, ans+diceno,i);
		}
		
//		dice(n-1,ans+"1");
//		dice(n-2,ans+"2");
//		dice(n-3, ans+"3");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		dice(n ,"",3);
	}

}
