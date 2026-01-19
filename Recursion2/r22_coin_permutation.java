package Recursion2;

import java.util.*;

public class r22_coin_permutation {
	public static void permutation(int[]arr,int target, 
			List<List<Integer>>ls,List<Integer>l, int sum ) {
		if(sum==target) {
			ls.add(new ArrayList<>(l));
			return;
		}
		if(sum>target) {
			return;
		}
		for(int i=0;i<arr.length;i++) {
			l.add(arr[i]);
			permutation(arr,target,ls,l,sum+arr[i]);
			l.remove(l.size()-1);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,5};
		int target=8;
		
		List<List<Integer>>ls=new ArrayList<>();
		List<Integer>l=new ArrayList<>();
		
		permutation(arr,target,ls,l,0);
		
		for(List<Integer> val: ls) {
			System.out.println(val);
		}

	}

}
