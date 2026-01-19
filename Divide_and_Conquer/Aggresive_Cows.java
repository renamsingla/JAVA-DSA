package Divide_and_Conquer;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_Cows {
	
	public static int binary(int[]stall, int c) {
		int ans=0;
		
		int low=0;
		int high=stall[stall.length-1]-stall[0];
		
		
		while(high>=low) {
			int mid=(low+high)/2;
			
			if(ispossible(stall,c,mid)) {
				ans=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return ans;
	}
	
	public static boolean ispossible(int[]stall, int c, int mid) {
		int cow=1;
		int position=stall[0];
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-position>=mid) {
				cow++;
				position=stall[i];
			}
			if(cow==c) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int t=s.nextInt();
		while(t>0) {
			int n= s.nextInt();
			int c=s.nextInt();
			int[]stall=new int[n];

			for(int i=0;i<n;i++) {
				stall[i]=s.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(binary(stall,c));
			t--;
		}
		

		
	
		

	}

}
