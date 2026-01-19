package leetcode;

public class max_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,3,1};
		for(int turn=1;turn<nums.length;turn++){
            for(int i=0;i<nums.length-turn;i++){
                if(Math.abs(nums[i+1])<Math.abs(nums[i])){
                    int temp= nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
		
        int i=0;
        int j= nums.length-1;
        while(j>i){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        for(int l=0;l<nums.length;l++) {
			System.out.println(nums[l]);
		}
        int score=0;
        for(int k=0;k<nums.length;k++){
            if(k%2==0 ){
                score+= Math.pow(nums[k],2);
                System.out.println(score); 
            }else{
                score-= Math.pow(nums[k],2);
                System.out.println(score); 
            }
        }
       System.out.println(score);    
	}

}
