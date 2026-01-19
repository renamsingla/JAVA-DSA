package Divide_and_Conquer;

public class Axis_and_Orbit {
	
	public static int PalindromicSubstring(String str) {
		
		int count=0;
		
		for(int axis=0; axis<str.length();axis++) {
			int orbit=0;
			while(orbit+axis<str.length() && axis-orbit>=0) {
				int ahead= axis+orbit;
				int before= axis-orbit;
				if(str.charAt(ahead)==str.charAt(before)) {
					count++;
					orbit++;
				}else {
					break;
				}
				  
			}
		}
		
		for(double axis=0.5; axis<str.length();axis++) {
			double orbit=0.5;
			while(orbit+axis<str.length() && axis-orbit>=0) {
				double ahead= axis+orbit;
				double before= axis-orbit;
				if(str.charAt((int)(ahead))==str.charAt((int)(before))) {
					count++;
					orbit++;
				}else {
					break;
				}
				  
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaaaaaa";
		int count=PalindromicSubstring(str);
		System.out.println(count);

	}

}
