package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class find_least_frequent_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer>hm= new HashMap<>();
		int n=1553322;
        int minfreq=Integer.MAX_VALUE;
        String str="";
        str+=n;
        System.out.println(str);
        int[]arr= new int[str.length()];
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            arr[i]=ch-'0';
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                int freq=hm.get(arr[i]);
                hm.put(arr[i],freq+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(int val:hm.keySet()) {
        	System.out.println(val+" "+hm.get(val));
        }

        for(int val:hm.keySet()){
            minfreq= Math.min(minfreq,hm.get(val));
        }

        int ans=10; //becuase digits are from 0 to 9 only
        for(Map.Entry<Integer,Integer>map: hm.entrySet()){
            if(map.getValue()==minfreq){
                ans= Math.min(ans, map.getKey());
            }
        }
        System.out.println(ans);

	}

}
