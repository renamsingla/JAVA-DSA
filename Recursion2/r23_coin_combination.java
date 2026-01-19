package Recursion2;

import java.util.ArrayList;
import java.util.List;

public class r23_coin_combination {
	
	public static void combination(int[]arr,int target, 
			List<List<Integer>>ls,List<Integer>l, int sum , int num) {
		if(sum==target) {
			ls.add(new ArrayList<>(l));
			return;
		}
		if(sum>target) {
			return;
		}
		for(int i=num;i<arr.length;i++) {
			l.add(arr[i]);
			combination(arr,target,ls,l,sum+arr[i],i);
			l.remove(l.size()-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,5};
		int target=8;
		
		List<List<Integer>>ls=new ArrayList<>();
		List<Integer>l=new ArrayList<>();
		
		combination(arr,target,ls,l,0,0);
		
		for(List<Integer> val: ls) {
			System.out.println(val);
		}

	}

}
