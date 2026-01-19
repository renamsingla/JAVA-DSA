package Recursion2;

import java.util.Scanner;

public class r10_BoardPath {
	
	public static void dice(String ans, int n, int m, int sol) {
		if(sol==n) {
			System.out.println(ans);
			return;
		}
		if(sol>n) {
			return;
		}
		for(int i=1;i<=m;i++) {
			dice(ans+i,n,m,sol+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int m=3;
		dice("",n,m,0);
	}

}
