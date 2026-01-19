package Sliding_Window;

public class Kartik_bhaiya_and_string {
	public static int maxlength(String s, int k, char ch) {
		int length=0;
		int maxl=0;
		int flip=0;
		int i=0;
		int j=0;
		while(j<s.length()) {
			if(s.charAt(j)==ch) {
				flip++;
			}
			while(flip>k && i<=j) {
				if(s.charAt(i)==ch) {
					flip--;
				}
				i++;
			}
			length=(j-i)+1;
			maxl=Math.max(maxl, length);
			j++;
		}
		return maxl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AABABBA";
		int k=1;
		int flipa=maxlength(s,k,'A');
		int flipb=maxlength(s,k,'B');
		int length= Math.max(flipa, flipb);
		System.out.println(length);

	}

}
