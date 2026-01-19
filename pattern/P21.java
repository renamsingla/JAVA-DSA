package pattern;

public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=1;
		int nsp=7;
		
		int row=1;
		while(row<=n) {
			
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			if(row==n) {
				nst--;
			}
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			nst+=1;
			nsp-=2;
			row++;
			System.out.println();
		}

	}

}
