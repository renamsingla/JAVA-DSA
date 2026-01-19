package pattern;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=0;
		int nst=5;
		
		int row=1;
		while(row<=n) {
			
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			nsp=nsp+2;
			nst--;
			row++;
			System.out.println();
		}
	}

}
