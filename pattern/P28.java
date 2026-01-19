package pattern;

public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int nsp=4;
		int num=1;
		int k=1;
		
		int row=1;
		while(row<=n) {
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			if(row==1) {
				System.out.print(k+" ");
//				k++;
			}else {
			
				for(int i=1;i<=num/2+1;i++) {
					System.out.print(k+" ");
					k++;
					
				}
				k-=2;
				
				for(int i=1;i<=num/2;i++) {
					System.out.print(k+" ");
					k--;
				
				}
			}
			if(row!=1) {
				k+=2;
			}else {
				k++;
			}
			
			nsp--;
			num+=2;
			row++;
			System.out.println();
		}
			

	}

}
