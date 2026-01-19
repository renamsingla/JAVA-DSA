package pattern;

public class P20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		int nsp=3;
		int nspm=-1;
		
		int row=1;
		while(row<=n) {
			
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			
			System.out.print("*"+" ");
			
			for(int i=1;i<=nspm;i++) {
				System.out.print(" "+" ");
			}
			
			if(row!=1 && row!=n) {
				System.out.print("*"+" ");
			}
			
			if(row<n/2+1) {
				nsp--;
				nspm+=2;
			}else {
				nsp++;
				nspm-=2;
			}
			row++;
			System.out.println();
		}

	}

}
