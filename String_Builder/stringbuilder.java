package String_Builder;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //16 +length of default string-builder
		sb.append("Hello");
		sb.append("Bye");
		sb.append("HelloBye");
		sb.append(1);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.delete(0, 3));
		System.out.println(sb);
		String s = sb.toString();
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(4,7));
		///System.out.println(sb.reverse());
		System.out.println(sb);


	}

}
