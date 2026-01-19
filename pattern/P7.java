package pattern;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		int nst=1;
		int nsp=3;
		
		int row=1;
		while(row<=n) {
			
			if(row==1 || row==n) {
				for(int i=1;i<=n;i++) {
					System.out.print("*"+" ");
				}
			}else {
				System.out.print("*"+" ");
				
				for(int i=1;i<=nsp;i++) {
					System.out.print(" "+" ");
				}
				
				System.out.print("*"+" ");
			}
			System.out.println();
			row++;
		}
		

	}

}
