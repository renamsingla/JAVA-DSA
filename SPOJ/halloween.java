package SPOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class halloween {
	
	public static void calculate (int[]sweets, ArrayList<Integer> arr, int i, int c) {
		int j=i;
		int sum=0;
		while(j<sweets.length) {
			sum+=sweets[j];
			arr.add(j+1);
			if(sum%c==0) {
				return ;
			}
			j++;
		}
		arr.removeAll(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int c= s.nextInt();
		int[] sweets= new int[n];  
		
		for(int i=0;i<n;i++) {
			sweets[i]=s.nextInt();
		}
		
		ArrayList<Integer> arr= new ArrayList<>();
		
		for(int i=0;i<sweets.length;i++) {
			
			calculate(sweets,arr,i,c );
			if(!arr.isEmpty()) {
				break;
			}
		}
		if(arr.isEmpty()) {
			System.out.println("no sweets");
		}else {
			for(Integer val:arr) {
				System.out.print(val+" ");
			}
		}

	}

}
