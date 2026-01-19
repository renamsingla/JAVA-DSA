	package pattern;

public class P27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int num=1;
		int nsp=4;
		
		int row=1;
		while(row<=n) {
			
			for(int i=1;i<=nsp;i++){
				System.out.print(" "+" ");
			}
			
			if(row==1) {
				System.out.print(num+" ");
			}else {
				int j=1;
				for(int i=1;i<=num/2+1;i++) {
					System.out.print(j+" ");
					j++;
				}
				j-=2;
				for(int i=1;i<=num/2;i++) {
					System.out.print(j+" ");
					j--;
				}
			}
			nsp--;
			num+=2;
			row++;
			System.out.println();
		}
	}

}
