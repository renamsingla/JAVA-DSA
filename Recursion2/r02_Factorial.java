package Recursion2;

import java.util.Scanner;

public class r02_Factorial {
	
	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		
		int fact= factorial(n-1);
		int ans= fact*n;
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		
		System.out.println(factorial(n));
	}

}
