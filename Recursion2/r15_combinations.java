package Recursion2;

import java.util.ArrayList;
import java.util.List;

public class r15_combinations {
	public static void combination(int n,int k,List<List<Integer>> ls,List<Integer>arr, int i){

        if(arr.size()==k){
            ls.add(new ArrayList<>(arr));
//            for(List<Integer> val: ls) {
//            	System.out.print(val+" ");
//            }
            return;
        }

        
//        while(i<=n){
//        	arr.add(i);
            for(int j=i;j<=n;j++){
                arr.add(j);
            combination(n,k,ls,arr,j+1);
                arr.remove(arr.size()-1);
        }
//        i++;
//        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=2;
		List<List<Integer>> ls= new ArrayList<>();
        List<Integer> arr= new ArrayList<>();

        combination(n,k,ls,arr,1);
        
        for(List<Integer> val: ls) {
        	System.out.print(val+" ");
        }

	}

}
