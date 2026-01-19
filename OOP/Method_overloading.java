package OOP;

public class Method_overloading {
//	all methods have same name and same return type, but different arguments
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b; 
	}
	public static int add(int a, int b, double c) {
		return a+b;
	}
	public static int add(int a, int...ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		return a+sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,3));
		System.out.println(add(2,3,2));
		System.out.println(add(2,3,8.9));
		System.out.println(add(2,3,3,0,4,45,6,7,7,0,4,6,8,4,3));

	}

}
