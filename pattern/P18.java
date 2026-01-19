package pattern;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int nsp=3;
		int nst=1;
		
		int row=1;
		while(row<=n) {
			
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			if(row<n/2+1) {
				nsp--;
				nst+=2;
			}else {
				nsp++;
				nst-=2;
			}
			row++;
			System.out.println();
		}

	}

}
