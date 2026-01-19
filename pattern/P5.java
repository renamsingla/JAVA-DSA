package pattern;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=5;
		int nsp=0;
		
		int row=1;
		while(row<=n) {
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			nsp++;
			nst--;
			row++;
			System.out.println();
		}

	}

}
