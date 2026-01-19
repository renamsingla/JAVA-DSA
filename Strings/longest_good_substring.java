package Strings;

import java.util.Scanner;

public class longest_good_substring {
	public static boolean isvowel(char c){
		if(c=='a' ||  c=='e' || c=='i' ||  c=='o' ||  c=='u'){
			return true;
		}
		return false;
	}	
	public static int longestgoodstring(String str){
		int count=0;
		int ans=0;
		for(int i=0;i<str.length();i++){
			char ch= str.charAt(i);
			if(isvowel(ch)==true){
				count++;
			}else{
				ans= Math.max(ans, count);
				count=0;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		String str= s.next();
		System.out.print(longestgoodstring(str));


	}

}
