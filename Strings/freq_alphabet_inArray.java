package Strings;

public class freq_alphabet_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		265- if all type of characters are given
//		26-only alphabet of same order
		String str="ASCbcdscbudsicbdjksc";
		int[]freq= new int[60];
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			int j=ch-'A';
			freq[j]++;
		}
//		to get alphabet from i-> ch=i+'a'
		
		for(int i=0;i<freq.length;i++) {
			System.out.print(freq[i]+" ");
		}

	}

}
