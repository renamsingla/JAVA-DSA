package pattern;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=0;
		int nst=9;
		
		int row=1;
		while(row<=n) {
			
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			nst-=2;
			nsp++;;
			row++;
			System.out.println();
		}

	}

}
