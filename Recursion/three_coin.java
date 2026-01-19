package Recursion;

public class three_coin {
	public static void coins(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		coins(n-1,ans+"H");// adding as a string
		coins(n-1,ans+'T');// adding as a character
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		coins(n,"");

	}

}
