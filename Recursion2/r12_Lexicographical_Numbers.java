package Recursion2;


public class r12_Lexicographical_Numbers {
	
	public static void lexico(int n, int val) {
		if(val>n) {
			return;
		}
		System.out.println(val);
//		if()
		int i=0;
		if(val==0) {
			i=1;
		}
		for(;i<=9;i++) {
			lexico(n,val*10+i);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
//		lexico(n,0);
		for(int i=1; i<=9; i++) {
			lexico(n, i);
		}
	}

}
