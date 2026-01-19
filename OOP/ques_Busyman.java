package OOP;

import java.util.Arrays;
import java.util.*;

public class ques_Busyman {
	
	public static class pair{ //static class because the main is static and 
//		                         non static can not be used in static field
		int st;
		int et;
		
		public pair(int st, int et) {
			this.st= st;
			this.et=et;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		
		while(t>0) {
			
			int n= s.nextInt();
			
			pair[]arr= new pair[n];
			for(int i=0;i<arr.length;i++) {
				int st= s.nextInt();
				int et= s.nextInt();
				
				arr[i]= new pair(st,et);
			}
			Arrays.sort(arr, new Comparator<pair>() {

				@Override
				public int compare(pair o1, pair o2) {
					// TODO Auto-generated method stub
					return o1.et-o2.et;
				}
				
			});
			
			int activity=1;
			int end= arr[0].et;
			
			for(int i=1;i<arr.length;i++) {
				if(end<=arr[i].st) {
					end=arr[i].et;
					activity++;
				}
			}
			
			t--;
			System.out.println(activity);
		}


	}

}
