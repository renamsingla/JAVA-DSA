package Recursion;

public class Lexico_counting {
	public static void lexico(int n, int counting) {
		if(counting>n) {
			return;
		}
		int i=0;
		System.out.println(counting);
		if(counting==0) {
			i=1;
		}
		for(;i<=9;i++) {
			lexico(n, counting*10+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		lexico(n,0);

	}

}
