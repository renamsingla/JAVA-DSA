package leetcode;

public class capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {9,3,3,3,9};
		if(nums.length<3){
            System.out.println("no subarray");
            return;
        }
        int i=0;
        int j=nums.length-1;
        long count=0;
        while(j>i && (j-i)>=2){
            if(nums[i]!=nums[j]){
                i++;
                j--;
                System.out.println("if");
            }else{
                int score=0;
                System.out.println("else");
                int k=i+1;
                int l=j-1;
                while(l>=k){
                    score+=nums[k];
                    k++;
                    System.out.println(score);
                }
                if(score==nums[i]){
                    count=count+1;
                }
                i++;
                j--;
            }
        }
        System.out.println(count);
	}

}
