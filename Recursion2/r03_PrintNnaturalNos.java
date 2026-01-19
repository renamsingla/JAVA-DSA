package Recursion2;

import java.util.Scanner;

public class r03_PrintNnaturalNos {
	
	public static void PrintNaturalNo(int n) {
		
		if(n==0) {
			return;
		}
		PrintNaturalNo(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		PrintNaturalNo(n);

	}

}
