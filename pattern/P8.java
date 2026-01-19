package pattern;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		int nst=1;
		int nspl=0;
		int nspm=3;
		
		int row=1;
		while(row<=n) {
			for(int i=1;i<=nspl;i++) {
				System.out.print(" "+" ");
			}
			
			System.out.print("*"+" ");
			
			for(int i=1;i<=nspm;i++) {
				System.out.print(" "+" ");
			}
			if(row!=3) {
				System.out.print("*"+" ");
			}
			
			row++;
			if(row<=3) {
				nspl++;
				nspm-=2;	
			}else {
				nspl--;
				nspm+=2;
			}
			System.out.println();
		}

	}

}
