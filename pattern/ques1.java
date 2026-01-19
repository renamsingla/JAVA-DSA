package pattern;

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int row=1;
		int nstl=1;
		int nspl=3;
		int nspm=-1;
		int nstr=1;
		
		while(row<=n) {
			if(row<=n/2+1) {
				int i=1;
				while(i<=nspl) {
					System.out.print(" "+" ");
					i=i+1;
				}
				
				int j=1;
				while(j<=nstl) {
					System.out.print("*"+" ");
					j=j+1;
				}
				
				int k=1;
				if(row>1) {
					while(k<=nspm) {
						System.out.print(" "+" ");
						k=k+1;
					}
				}
				
				
				
				int m=1;
				if(row>1) {
					while(m<=nstr) {
						System.out.print("*"+" ");
						m=m+1;
					}
					
					
				}
				nspl=nspl-1;
	        	nspm=nspm+2;
	        	row=row+1;
	        	System.out.println();
			}
			else {
				nspl=nspl+2;
	        	nspm=nspm-4;
				int i=1;
				while(i<=nspl) {
					System.out.print(" "+" ");
					i=i+1;
				}
				
				int j=1;
				while(j<=nstl) {
					System.out.print("*"+" ");
					j=j+1;
				}
				
				int k=1;
				if(row<n) {
					while(k<=nspm) {
						System.out.print(" "+" ");
						k=k+1;
					}
				}
				
				
				
				int m=1;
				if(row<n) {
					while(m<=nstr) {
						System.out.print("*"+" ");
						m=m+1;
					}
					
					
				}
				nspl=nspl-1;
	        	nspm=nspm+2;
	        	row=row+1;
	        	System.out.println();
			}
			
				
			
			
			
			
		}
		

	}

}
