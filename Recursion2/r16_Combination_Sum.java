package Recursion2;

import java.util.ArrayList;
import java.util.List;

public class r16_Combination_Sum {
	public static void combinations(int[]arr, int target,List<Integer> l,
			List<List<Integer>> ls, int start, int sum) {
		if(sum==target) {
			ls.add(new ArrayList<>(l));
//			for(List<Integer> val: ls) {
//	        	System.out.print(val+" ");
//	        }

//			sum=0;
//			l.clear();
			return;
		}
		
		for(int i=start;i<arr.length;i++) {
			
			if(sum+arr[i]<=target) {
//				sum= sum+arr[i];
				l.add(arr[i]);
				combinations(arr,target,l,ls,i,sum+arr[i]);
				l.remove(l.size()-1);
//				sum-=arr[i];
			}
			
//				if(l.size()==0) {
//					continue;
//				}
//				l.remove(l.size()-1);
//				sum-=arr[i];
//				combinations(arr,target,l,ls,i+1,sum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,6,7};
		int target=7;
		
		List<List<Integer>> ls= new ArrayList<>();
		List<Integer> l= new ArrayList<>();
		
		combinations(arr,target,l,ls,0,0);

		for(List<Integer> val: ls) {
        	System.out.print(val+" ");
        }

	}

}
