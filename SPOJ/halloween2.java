package SPOJ;

import java.util.Scanner;

public class halloween2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int c= s.nextInt();
		int[] sweets= new int[n];  
		
		for(int i=0;i<n;i++) {
			sweets[i]=s.nextInt();
		}
		
		
		int[]sumarr=new int[n];
		int sum=0;
		for(int i=0;i<sumarr.length;i++) {
			sum+=sweets[i];
			sumarr[i]= sum;
		}
		
		int[]brr= new int[n+1];
		brr[0]=0;
		for(int i=1;i<brr.length;i++) {
			brr[i]=sumarr[i=1]%c;
		}
		
		
		
		

	}

}
