package Basics;

public class Pallidromic {
	
	public static boolean pallidrom(String str) {
		int i=0;
		int j= str.length()-1;
		while(j>=i) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "naan";
		System.out.print(pallidrom(str));

	}

}
