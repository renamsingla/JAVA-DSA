package pattern;

public class P33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int nsp=9;
		int num=1;
		int j=10;
		
		
		int row=1;
		while(row<=n) {
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			if(row==1) {
				System.out.print(0+" ");
			}else {
				
				for(int i=1;i<=num/2;i++) {
					System.out.print(j+" ");
					j++;
				}
			
				
				System.out.print(0+" ");
				
				int k=9;
				for(int i=num/2+2;i<=num;i++) {
					System.out.print(k+" ");
					k--;
				}
				k++;
			}
			j=10;
			j=j-row;
			num+=2;
			nsp--;
			row++;
			System.out.println();
		}

	}

}
