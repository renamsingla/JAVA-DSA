package Strings;

import java.util.Scanner;

public class Print_Substring_lengthwise {
//	public static void substring(String str) {
//		for(int len=1;len<=str.length();len++) {
//			for(int j=len;j<=str.length();j++) {
//				int i=j-len;
//				System.out.println(str.substring(i,j));
//			}
//		}
//	}

public static void substring(String str) {
	for(int len=1;len<=str.length();len++) {
		for(int j=len;j<=str.length();j++) {
			int i=j-len;
			System.out.println(str.substring(i,j));
		}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str= s.next();
		substring(str);

	}

}
