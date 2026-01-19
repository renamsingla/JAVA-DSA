package Stack;

import java.util.Stack;

public class Maximal_Rectangle {
	
	public static int histogram(int[]arr, int area){
        Stack<Integer>st= new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h= arr[st.pop()];
                System.out.println(h);
                int r=i;
                if(!st.isEmpty()){
                    area=Math.max(area, h*(r-st.peek()-1));
                }else{
                    area=Math.max(area,h*r);
                }
       
//                System.out.println(st);
            }
            st.push(i);
        }
        System.out.println(st);
        int r= arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            if(!st.isEmpty()){
                    area=Math.max(area, h*(r-st.peek()-1));
                }else{
                    area=Math.max(area,h*r);
                }
        }
        return area;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix= {{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'}};
		
		int n= matrix.length;
        int m= matrix[0].length;
        int area= 0;
        int k=0;
        while(k!=n){
            int[]arr= new int[m];
            for(int i=0;i<m;i++){
                if(matrix[k][i]=='0'){
                    arr[i]=0;
                }else{
                    int count=0;
                    int j=k;
                    while(j>=0 && matrix[j][i]!='0'){
                        count++;
                        j--;
                    }
                    arr[i]=count;
                }
            }
             for(int i=0;i<m;i++){
                 System.out.print(arr[i]+" ");
             }
             System.out.println();
            area=Math.max(area,histogram(arr,area));
            k++;
        }
        System.out.println(area);
	}

}
