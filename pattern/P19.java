package pattern;

public class P19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int nst=3;
		int nsp=1;
		
		int row=1;
		while(row<=n) {
			
			if(row==1 || row==n) {
				for(int i=1;i<=n;i++) {
					System.out.print("*"+" ");
				}
			}else {
				for(int i=1;i<=nst;i++) {
					System.out.print("*"+" ");
				}
				
				for(int i=1;i<=nsp;i++) {
					System.out.print(" "+" ");
				}
				
				for(int i=1;i<=nst;i++) {
					System.out.print("*"+" ");
				}
				
				if(row<=n/2) {
					nst-=1;
					nsp+=2;
				}else {
					nst+=1;
					nsp-=2;
				}
			}
			row++;
			System.out.println();
			
		}

	}

}
