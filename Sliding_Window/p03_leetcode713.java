package Sliding_Window;

public class p03_leetcode713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
		int k=19;
		
		int length= 1;
        int output=0;
        long product=1;

        while(length<=nums.length){
            int i=0;
            for(;i<length;i++){
                product*=nums[i];
            }
            
            if(product<k ){
            	System.out.println(product);
                output++;
            }
            

            for(int j=i; j<nums.length; j++){
                product*=nums[j];
                product/=nums[j-length];
                if(product<k ){
                	System.out.println(product);
                    output++;
                }
            }
            product=1;
            length++;
        }
        
        System.out.println(output);


	}

}
