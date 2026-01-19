package String_Builder;

public class stringbuilder_vs_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String_demo();
		String_builder_demo();
	}
	
	public static void String_demo() {
		String s= "";
		for(int i=0;i<1000000;i++) {
			s+=i;
		}
		System.out.println(s);
		
	}
	
public static void String_builder_demo() {
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<1000000;i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}

}
