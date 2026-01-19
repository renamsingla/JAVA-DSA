package pattern;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		int nst=3;
		int nsp=1;
		
		int row=1;
		while(row<=n) {
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			if(row<n/2+1) {
				nst--;
				nsp+=2;
			}else {
				nst++;
				nsp-=2;
			}
			row++;
			System.out.println();
			
		}

	}

}
