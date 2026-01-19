package pattern;

public class P32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int num=1;
		int j=1;
		
		int row=1;
		while(row<=9) {
			
			for(int i=1;i<=num;i++) {
				if(i%2==0) {
					System.out.print("*"+" ");
				}else {
					System.out.print(j+" ");
				}
			}
			if(row<n) {
				num+=2;
				row++;
				j++;
			}else {
				num-=2;
				row++;
				j--;
			}
			System.out.println();
		}

	}

}
